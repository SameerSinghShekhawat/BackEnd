package com.lti.app.service;

import com.lti.app.pojo.InstituteApprovalStatus;

public interface InstApprovalService {
	
	public void addInstApproval(InstituteApprovalStatus instApproval);
	
	public String getMinistApproval(String instid);
	
	public InstituteApprovalStatus  getInstApp(String instid);
	
	public void setNodalStat(InstituteApprovalStatus insta);

}
