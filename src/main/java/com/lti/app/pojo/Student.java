package com.lti.app.pojo;

import javax.persistence.*;

@Entity
@Table(name="student001")
public class Student {
	@Id
	@Column(name="uniid")
	String uniqid;
	String name;
	String password;
	String state;
	String district;
	String dob;
	String gender;
	String mobile;
	String email;
	String institutecode;
	String bankifsc;
	String bankaccount;
	String bankname;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String uniqid, String name, String password, String state, String district, String dob,
			String gender, String mobile, String email, String institutecode, String bankifsc, String bankaccount,
			String bankname) {
		super();
		this.uniqid = uniqid;
		this.name = name;
		this.password = password;
		this.state = state;
		this.district = district;
		this.dob = dob;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		this.institutecode = institutecode;
		this.bankifsc = bankifsc;
		this.bankaccount = bankaccount;
		this.bankname = bankname;
	}
	public String getUniqid() {
		return uniqid;
	}
	public void setUniqid(String uniqid) {
		this.uniqid = uniqid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getInstitutecode() {
		return institutecode;
	}
	public void setInstitutecode(String institutecode) {
		this.institutecode = institutecode;
	}
	public String getBankifsc() {
		return bankifsc;
	}
	public void setBankifsc(String bankifsc) {
		this.bankifsc = bankifsc;
	}
	public String getBankaccount() {
		return bankaccount;
	}
	public void setBankaccount(String bankaccount) {
		this.bankaccount = bankaccount;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	
	
	
	
	
	

}
