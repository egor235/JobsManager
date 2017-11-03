package com.crudmanager.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.crudmanager.dao.JobsRepository;
import com.crudmanager.model.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Service;

@Service
public class JobsServiceIm implements JobsService {
	@Autowired
	private JobsRepository jobsRepository;


	@Override
	public void save(Jobs entity) {
			jobsRepository.save(entity);

	}
	public List<Jobs> findAll() {
		return (List<Jobs>) jobsRepository.findAllByOrderByName();
	}

	@Override
	public Jobs findById(Long id) {
		return jobsRepository.findOne(id);
	}

	@Override
	public void deleteById(Long id) {
		jobsRepository.delete(id);
	}
}
