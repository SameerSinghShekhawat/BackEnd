package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Student;

public interface StudentRepo {
	
	public List<Student> showAllStudent();
	public void addStudent(Student student);
	public boolean updateStudent(Student student);
	
	public Student searchStudentById(String uniqid);

}
