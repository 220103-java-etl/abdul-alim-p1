package dev.alim.repository;

import java.util.List;

public interface GenericAuthorDAO <A>{
    // Create
    A add(A a);

    // Read
    A getById(Integer id);

    List<A> getAll();

    // Update
    void update(A a);
}
