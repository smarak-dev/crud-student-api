package com.app.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.crud.entity.Student;
import com.app.crud.repo.StudentRepo;

@SpringBootApplication
public class CrudStudentApiApplication implements CommandLineRunner{

	@Autowired
	private StudentRepo repo;
	
	public static void main(String[] args) {
		SpringApplication.run(CrudStudentApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Student s1=new Student("prince","Hyderabad","pk22cs@gmail.com");
		Student s2=new Student("Ajit","Bihar","aj@gmail.com");
		Student s3=new Student("Rahul","Bhopal","rahuls@gmail.com");
		Student s4=new Student("Deepak","Hyderabad","dekcs@gmail.com");
		
		repo.save(s1);
		repo.save(s2);
		repo.save(s3);
		repo.save(s4);
		
	}

}
