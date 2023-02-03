package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Student;
import com.lti.app.repository.StudentRepo;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo studRepo;
	
	@Override
	public void addStudent(Student student) {
		studRepo.addStudent(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		studRepo.updateStudent(student);
		return true;
	}

	@Override
	public List<Student> showAllStudent() {
		return studRepo.showAllStudent();
	}

	@Override
	public Student searchStudentById(String uniqid) {
		return studRepo.searchStudentById(uniqid);
	}

}
