package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Scholarship;

public interface ScholarshipService {
	
	public void addData(Scholarship sch);
	public List<Scholarship> getData();
	public Scholarship getScholarDetails(String uniqid);
	public List<Scholarship> instWiseScholar(String institutename);

}
