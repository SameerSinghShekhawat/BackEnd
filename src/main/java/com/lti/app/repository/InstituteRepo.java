package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Institute;

public interface InstituteRepo {
	public void addInstitute(Institute inst);
	
	public Institute searchInstitute(String instid);
	
	public List<Institute> getInstitute();
	
}
