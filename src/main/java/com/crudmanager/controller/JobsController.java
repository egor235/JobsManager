package com.crudmanager.controller;


import java.util.List;
import com.crudmanager.model.Jobs;
import com.crudmanager.service.JobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;



/*
2. Методы веб-службы


PUT /vacancy

Создание новой вакансии

GET /vacancy

Список вакансий отсортированных по наименованию


GET /vacancy/{id}

Вакансия с ID {id}


DELETE /vacancy/{id}

удаление вакансии с ID {id}

4. Формат данных
При взаимодействии с веб-службой данные передаются в XML формате.*/
@RestController
@RequestMapping(value = "/vacancy")
public class JobsController {

	@Autowired
	private JobsService jobsservice;

	@RequestMapping(value = "/",
			method = RequestMethod.PUT,
			produces = {MediaType.APPLICATION_XML_VALUE })
	//	public List<Jobs> putJob(Jobs job) {
		public void putJob(Jobs job){
		jobsservice.save(job);
		//return jobsservice.findAll();
	}

	@RequestMapping(value = "/",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE })
	public List<Jobs> getJobs() {
		return jobsservice.findAll();
	}

	@RequestMapping(value = "/{id}",
			method = RequestMethod.GET,
			produces = {MediaType.APPLICATION_XML_VALUE })
	public Jobs findById(@PathVariable(value = "id") Long id) {
		   return jobsservice.findById(id);
	}

	@RequestMapping(value = "/{id}",
			method = RequestMethod.DELETE,
			produces = {MediaType.APPLICATION_XML_VALUE })
	public void deleteJob(@PathVariable("id") Long id) {
		jobsservice.deleteById(id);
			}
}
