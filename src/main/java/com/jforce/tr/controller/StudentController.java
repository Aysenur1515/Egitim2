package com.jforce.tr.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.jforce.tr.dao.StudentDaoImpl;
import com.jforce.tr.model.Student;

@RestController


public class StudentController {
	
	//enjekte ettik
	@Autowired
	private StudentDaoImpl studentDaoImpl;
	
	@RequestMapping(path= "/students" , method = RequestMethod.GET)
	public ResponseEntity<List<Student>> getStudents() {
		
		return ResponseEntity.ok(studentDaoImpl.getStudentList());
		
		
		
	}
	//id ye göre öğrenci getirme
	@RequestMapping(path = "/student/{id}")
	public Student getStudentId(@PathVariable  Integer id) {
		
		Student student = studentDaoImpl.getStudentById(id);
		return student;
	}
	//öğrenci silme
	@RequestMapping(path = "/studentdelete/{id}" , method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable Integer id) {
		studentDaoImpl.delete(id);
		System.out.println("Silindi...");
	
		
	}
	//öğrenci güncelleme
	@RequestMapping(path = "/updateStudent/{id}" , method = RequestMethod.POST)
	public void updateStudent(@RequestBody Student student) {
		studentDaoImpl.update(student);
		
		
	}
	// öğrenci ekleme
	@RequestMapping(path = "/studentadd" , method = RequestMethod.POST)
	public String add(@RequestBody Student student) {
	studentDaoImpl.add(student);
	return "öğrenci eklenmiştir";
}
}


