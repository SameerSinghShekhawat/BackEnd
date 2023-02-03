package com.lti.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="scholarshipapproval")
public class ScholarshipApproval {
	
	@Id
	private String uniqid;
	private String instapproval;
	private String nodalapproval;
	private String ministryapproval;
	
	
	
	public ScholarshipApproval() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScholarshipApproval(String uniqid, String instapproval, String nodalapproval, String ministryapproval) {
		super();
		this.uniqid = uniqid;
		this.instapproval = instapproval;
		this.nodalapproval = nodalapproval;
		this.ministryapproval = ministryapproval;
	}
	public String getUniqid() {
		return uniqid;
	}
	public void setUniqid(String uniqid) {
		this.uniqid = uniqid;
	}
	public String getInstapproval() {
		return instapproval;
	}
	public void setInstapproval(String instapproval) {
		this.instapproval = instapproval;
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
	
	
	
	

}
