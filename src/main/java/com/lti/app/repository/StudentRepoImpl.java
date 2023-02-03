package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Student;

@Repository
public class StudentRepoImpl implements StudentRepo {
	
	@Autowired
	EntityManager eMan;

	@Override
	public void addStudent(Student student) {
		eMan.persist(student);
	}

	@Override
	public boolean updateStudent(Student student) {
		eMan.merge(student);
		return true;
	}

	@Override
	public List<Student> showAllStudent() {
		Query qry=eMan.createQuery("from Student");
		return qry.getResultList();
	}

	@Override
	public Student searchStudentById(String uniqid) {
		Student ss = eMan.find(Student.class, uniqid);		
		return ss;
	}

}
