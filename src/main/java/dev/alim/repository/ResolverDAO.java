package dev.alim.repository;

import dev.alim.models.Reimbursement;
import dev.alim.util.ConnectionUtil;

import java.util.List;

public class ResolverDAO implements GenericResolverDAO<Reimbursement> {

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    @Override
    public Reimbursement add(Reimbursement reimbursement) {
        return null;
    }

    @Override
    public Reimbursement getById(Integer id) {
        return null;
    }

    @Override
    public List<Reimbursement> getAll() {
        return null;
    }

    @Override
    public void update(Reimbursement reimbursement) {

    }
}
