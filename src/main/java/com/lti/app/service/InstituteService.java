package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Institute;

public interface InstituteService {
	
	public void addInstitute(Institute inst);
	
	public Institute searchInstitue(String instid);
	
	public List<Institute> getInstitute();
	
	public Institute getInstitute(String instid);

}
