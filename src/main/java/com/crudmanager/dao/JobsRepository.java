package com.crudmanager.dao;

import com.crudmanager.model.Jobs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobsRepository extends CrudRepository<Jobs,Long> {

    List<Jobs> findAllByOrderByName();
}
