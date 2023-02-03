package com.lti.app.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institute01")
public class Institute{

@Id
private String instid;

private String instcategory;

private String inststate;

private String instdisecode;

private String instname;

private String insttype;

private String instaffiliatedinsttype;

private String instaffialteduniboardname;

private String instpassword;

private String instaddressline1 ;
private String instaddressline2;
private String instcity;

private String instmail;

private String instdistrict;

private String instprincipalname;



public Institute(String instid, String instcategory, String inststate, String instdisecode, String instname,
		String insttype, String instaffiliatedinsttype, String instaffialteduniboardname, String instpassword,
		String instaddressline1, String instaddressline2, String instcity, String instmail, String instdistrict,
		String instprincipalname) {
	super();
	this.instid = instid;
	this.instcategory = instcategory;
	this.inststate = inststate;
	this.instdisecode = instdisecode;
	this.instname = instname;
	this.insttype = insttype;
	this.instaffiliatedinsttype = instaffiliatedinsttype;
	this.instaffialteduniboardname = instaffialteduniboardname;
	this.instpassword = instpassword;
	this.instaddressline1 = instaddressline1;
	this.instaddressline2 = instaddressline2;
	this.instcity = instcity;
	this.instmail = instmail;
	this.instdistrict = instdistrict;
	this.instprincipalname = instprincipalname;
}

public Institute() {
	super();
	// TODO Auto-generated constructor stub
}

public String getInstid() {
	return instid;
}

public void setInstid(String instid) {
	this.instid = instid;
}

public String getInstcategory() {
	return instcategory;
}

public void setInstcategory(String instcategory) {
	this.instcategory = instcategory;
}

public String getInststate() {
	return inststate;
}

public void setInststate(String inststate) {
	this.inststate = inststate;
}

public String getInstdisecode() {
	return instdisecode;
}

public void setInstdisecode(String instdisecode) {
	this.instdisecode = instdisecode;
}

public String getInstname() {
	return instname;
}

public void setInstname(String instname) {
	this.instname = instname;
}

public String getInsttype() {
	return insttype;
}

public void setInsttype(String insttype) {
	this.insttype = insttype;
}

public String getInstaffiliatedinsttype() {
	return instaffiliatedinsttype;
}

public void setInstaffiliatedinsttype(String instaffiliatedinsttype) {
	this.instaffiliatedinsttype = instaffiliatedinsttype;
}

public String getInstaffialteduniboardname() {
	return instaffialteduniboardname;
}

public void setInstaffialteduniboardname(String instaffialteduniboardname) {
	this.instaffialteduniboardname = instaffialteduniboardname;
}

public String getInstpassword() {
	return instpassword;
}

public void setInstpassword(String instpassword) {
	this.instpassword = instpassword;
}

public String getInstaddressline1() {
	return instaddressline1;
}

public void setInstaddressline1(String instaddressline1) {
	this.instaddressline1 = instaddressline1;
}

public String getInstaddressline2() {
	return instaddressline2;
}

public void setInstaddressline2(String instaddressline2) {
	this.instaddressline2 = instaddressline2;
}

public String getInstcity() {
	return instcity;
}

public void setInstcity(String instcity) {
	this.instcity = instcity;
}

public String getInstmail() {
	return instmail;
}

public void setInstmail(String instmail) {
	this.instmail = instmail;
}

public String getInstdistrict() {
	return instdistrict;
}

public void setInstdistrict(String instdistrict) {
	this.instdistrict = instdistrict;
}

public String getInstprincipalname() {
	return instprincipalname;
}

public void setInstprincipalname(String instprincipalname) {
	this.instprincipalname = instprincipalname;
}






		
	
	

}
