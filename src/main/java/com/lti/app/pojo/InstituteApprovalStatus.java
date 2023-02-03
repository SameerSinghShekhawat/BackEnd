package com.lti.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="instituteapprovalatatus")
public class InstituteApprovalStatus {
	
	@Id
	private String instid;
	
	private String nodalapproval;
	private String ministryapproval;
	
	public String getInstid() {
		return instid;
	}
	public void setInstid(String instid) {
		this.instid = instid;
	}
	public String getNodalapproval() {
		return nodalapproval;
	}
	public void setNodalapproval(String nodalapproval) {
		this.nodalapproval = nodalapproval;
	}
	public String getMinistryapproval() {
		return ministryapproval;
	}
	public void setMinistryapproval(String ministryapproval) {
		this.ministryapproval = ministryapproval;
	}
	public InstituteApprovalStatus(String instid, String nodalapproval, String ministryapproval) {
		super();
		this.instid = instid;
		this.nodalapproval = nodalapproval;
		this.ministryapproval = ministryapproval;
	}
	public InstituteApprovalStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
