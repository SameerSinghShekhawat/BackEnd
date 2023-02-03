package com.lti.app.repository;

import com.lti.app.pojo.InstituteApprovalStatus;

public interface InstApprovalRepo {
	
	public void addInstAppoval(InstituteApprovalStatus instAppStatus);
	
	public String getMinistApproval(String instid);
	
	public InstituteApprovalStatus getInstApp(String instid);
	
	public void setNodalStat(InstituteApprovalStatus insta);

}
