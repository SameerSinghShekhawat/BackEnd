package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Student;

public interface StudentService {
	
	public void addStudent(Student student);
	public boolean updateStudent(Student student);
	public List<Student> showAllStudent();
	public Student searchStudentById(String uniqid);

}
