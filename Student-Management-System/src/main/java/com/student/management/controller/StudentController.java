package com.student.management.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.student.management.entity.Student;
import com.student.management.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentSer;
	
	@GetMapping("/students")
	public String getAllStudents(Model model){
//		return studentSer.getAllAtudents();
		model.addAttribute("students", studentSer.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createstudentFrom(Model model) {
		Student s = new Student();
		model.addAttribute("student",s);
		return "create_student";
	}
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student){
		
		studentSer.saveStudent(student);
		return "redirect:/students";
	}
	@PutMapping("/students/update")
	public String updateStudents(@ModelAttribute("student") Student student) {
		studentSer.saveStudent(student);
		return "redirect:/students/update";
	}
}
