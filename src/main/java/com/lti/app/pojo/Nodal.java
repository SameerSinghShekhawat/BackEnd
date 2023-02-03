package com.lti.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nodal")
public class Nodal {
	@Id
	private String userid;
	private String password;
	
	public Nodal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Nodal(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

