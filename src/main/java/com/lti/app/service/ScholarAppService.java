package com.lti.app.service;

import com.lti.app.pojo.ScholarshipApproval;

public interface ScholarAppService {
	
	void addScholarApproval(ScholarshipApproval scap);
	
	public ScholarshipApproval getScholarApp(String uniqid);
	
	public void updateStat(ScholarshipApproval scap);
	
}
