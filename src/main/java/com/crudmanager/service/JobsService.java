package com.crudmanager.service;


import com.crudmanager.model.Jobs;

import java.util.List;

public interface JobsService {

    void save(Jobs entity);
    List<Jobs> findAll();
    Jobs findById(Long id);
    void deleteById(Long id);



}
