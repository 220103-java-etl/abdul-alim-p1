package dev.alim.repository;

import java.util.List;

public interface GenericResolverDAO<R>{
    // Create
    R add(R r);

    // Read
    R getById(Integer id);

    List<R> getAll();

    // Update
    void update(R r);
}
