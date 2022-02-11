package dev.alim.repository;

import dev.alim.models.Reimbursement;
import dev.alim.models.Status;
import dev.alim.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ResolverDAO implements GenericDAO<Reimbursement>{
    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();
    @Override
    public Reimbursement add(Reimbursement reimbursement) {
        return null;
    }

    @Override
    public Reimbursement getById(Integer id) {
        return null;
    }

    public List<Reimbursement> getAll(){
        List<Reimbursement> pendingReimbursement = new ArrayList<>();

        try (Connection connection = cu.getConnection()) {

            String sql = "select r.id as reimbursement_id, user_id, createdDate ,status, payableCost, resolvedDate from reimbursement r join users u on u.id = r.user_id where role ='EMPLOYEE'";

            PreparedStatement ps = connection.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Reimbursement pr = new Reimbursement (
                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getTimestamp("createdDate"),
                        Status.valueOf(rs.getString("status")),
                        rs.getTimestamp("resolvedDate")
                );
                pendingReimbursement.add(pr);
            }

            return pendingReimbursement;

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public void update(Reimbursement reimbursement) {

    }

    @Override
    public void delete(Integer id) {

    }
}
