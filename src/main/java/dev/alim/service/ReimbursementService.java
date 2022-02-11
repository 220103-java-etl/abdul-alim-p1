package dev.alim.service;

import dev.alim.models.Reimbursement;
import dev.alim.repository.ReimbursementDAO;

public class ReimbursementService {
    ReimbursementDAO reimbursementDAO = new ReimbursementDAO();

    public Reimbursement addReimbursement(Reimbursement r) {
        return reimbursementDAO.add(r);

    }
    public Reimbursement updateReimbursement(Reimbursement re){
        return reimbursementDAO.update(re);
    }
}
