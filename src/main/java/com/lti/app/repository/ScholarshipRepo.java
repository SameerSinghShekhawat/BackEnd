package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Scholarship;

public interface ScholarshipRepo {
	
	public void addData(Scholarship sch);
	public List<Scholarship> getData();
	public Scholarship getScholarDetails(String uniqid);
	public List<Scholarship> instWiseScholar(String institutename);

}
