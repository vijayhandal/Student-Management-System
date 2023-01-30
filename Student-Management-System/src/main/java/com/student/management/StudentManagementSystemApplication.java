package com.student.management;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.student.management.entity.Student;
import com.student.management.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
//	@Autowired
//	private StudentRepository sRepo;
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		Student stud1 = new Student("Vijay","Handal","handal@gmail.com");
//		sRepo.save(stud1);
//		Student stud2 = new Student("Sumit","Shinde","shinde@gmail.com");
//		sRepo.save(stud2);
//		Student stud3 = new Student("Amit","shinde","shinde@gmail.com");
//		sRepo.save(stud3);
//		
//		
//		
//	}

}
