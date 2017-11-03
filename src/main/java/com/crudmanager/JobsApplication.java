package com.crudmanager;

import com.crudmanager.dao.JobsRepository;
import com.crudmanager.model.Jobs;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobsApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobsApplication.class, args);

	}
	@Bean
	public CommandLineRunner loadData(JobsRepository repository) {
		return (args) -> {
						repository.save(new Jobs("Developer", 120000,"1", "Moscow"));
			repository.save(new Jobs("Doctor",170000,"5", "New York"));
			repository.save(new Jobs("Plumber",100000,"4", "Sarov"));
			repository.save(new Jobs("Driver",90000,"2", "Nizhniy Novgorod"));
			repository.save(new Jobs("Caretaker",10000,"1", "Tver"));


		};
	}
}
