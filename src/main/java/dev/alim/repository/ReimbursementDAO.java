package dev.alim.repository;

import dev.alim.models.Reimbursement;
import dev.alim.models.Status;
import dev.alim.models.User;
import dev.alim.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ReimbursementDAO {
    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    public Reimbursement add(Reimbursement reimbursement) {

       String sql = "insert into  reimbursement (id, user_id, eventType,eventLocation, eventDate, grade,eventcost,description)values (default, ?, ?,?,?,?,?,?)" ;
        try (Connection conn = cu.getConnection()) {

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, reimbursement.getAuthor().getId());
            ps.setString(2,reimbursement.getEventType().toString());
            ps.setString(3, reimbursement.getEventLocation());
            ps.setDate(4,reimbursement.getEventDate());
            ps.setString(5, reimbursement.getGrade());
            ps.setDouble(6,reimbursement.getEventCost());
            ps.setString(7,reimbursement.getDescription());

           if (reimbursement != null)
               ps.executeUpdate();

           return reimbursement;

    } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Reimbursement update(Reimbursement reimbursement) {
        try (Connection conn = cu.getConnection()) {

            String sql = "update reimbursement set status = ?, payableCost = ?, resolvedDate =? where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,reimbursement.getStatus().toString());
            ps.setDouble(2, reimbursement.getPayableCost());
            ps.setTimestamp(3, Timestamp.valueOf(reimbursement.getResolvedDate().toString()));
            ps.setInt(4,reimbursement.getId());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reimbursement;
    }

}
