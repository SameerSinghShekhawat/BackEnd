package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.InstituteApprovalStatus;
import com.lti.app.pojo.Scholarship;
import com.lti.app.pojo.ScholarshipApproval;

public interface ScholarAppRepo {
	
	void addScholarApp(ScholarshipApproval scap);
	
	public ScholarshipApproval getScholarApp(String uniqid);
	
	public void updateStat(ScholarshipApproval scap);
	

}
