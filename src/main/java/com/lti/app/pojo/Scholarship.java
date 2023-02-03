package com.lti.app.pojo;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "scholarship")
public class Scholarship {
	
	@Id
	@Column(name="uniqid")
	private String uniqid;
	private String relegion;
	private String category;
	private String fathername;
	private String mothername;
	private String annualincome;
	
	private String institutename;	
	private String presentclass;
	private String presentclassyear;
	private String modeofstudy;
	private String classstartdate;
	private String universityname;
	private String previousclass;
	private String previouspassingyear;
	private String previuosclasspercent;
	
	private String rollnum10;
	private String boardname10;
	private String passingyear10;
	private String prcentobt10;
	
	private String rollnum12;
	private String boardname12;
	private String passingyear12;
	private String prcentobt12;
	
	private String admissionfee;
	private String tutionfee;
	private String otherfee;
	
	private String isdisabled;
	private String disabilitytype;
	private String disabilitypercentage;
	private String maritialstatus;
	private String parentsprofession;
	
	private String state;
	private String district;
	private String taluk;
	private String housenumber;
	private String streetnumber;
	private String pincode;
	
	private String scheme;
	
	

	public Scholarship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Scholarship(String uniqid, String relegion, String category, String fathername, String mothername,
			String annualincome, String institutename, String presentclass, String presentclassyear, String modeofstudy,
			String classstartdate, String universityname, String previousclass, String previouspassingyear,
			String previuosclasspercent, String rollnum10, String boardname10, String passingyear10, String prcentobt10,
			String rollnum12, String boardname12, String passingyear12, String prcentobt12, String admissionfee,
			String tutionfee, String otherfee, String isdisabled, String disabilitytype, String disabilitypercentage,
			String maritialstatus, String parentsprofession, String state, String district, String taluk,
			String housenumber, String streetnumber, String pincode, String scheme) {
		super();
		this.uniqid = uniqid;
		this.relegion = relegion;
		this.category = category;
		this.fathername = fathername;
		this.mothername = mothername;
		this.annualincome = annualincome;
		this.institutename = institutename;
		this.presentclass = presentclass;
		this.presentclassyear = presentclassyear;
		this.modeofstudy = modeofstudy;
		this.classstartdate = classstartdate;
		this.universityname = universityname;
		this.previousclass = previousclass;
		this.previouspassingyear = previouspassingyear;
		this.previuosclasspercent = previuosclasspercent;
		this.rollnum10 = rollnum10;
		this.boardname10 = boardname10;
		this.passingyear10 = passingyear10;
		this.prcentobt10 = prcentobt10;
		this.rollnum12 = rollnum12;
		this.boardname12 = boardname12;
		this.passingyear12 = passingyear12;
		this.prcentobt12 = prcentobt12;
		this.admissionfee = admissionfee;
		this.tutionfee = tutionfee;
		this.otherfee = otherfee;
		this.isdisabled = isdisabled;
		this.disabilitytype = disabilitytype;
		this.disabilitypercentage = disabilitypercentage;
		this.maritialstatus = maritialstatus;
		this.parentsprofession = parentsprofession;
		this.state = state;
		this.district = district;
		this.taluk = taluk;
		this.housenumber = housenumber;
		this.streetnumber = streetnumber;
		this.pincode = pincode;
		this.scheme = scheme;
	}

	public String getUniqid() {
		return uniqid;
	}

	public void setUniqid(String uniqid) {
		this.uniqid = uniqid;
	}

	public String getRelegion() {
		return relegion;
	}

	public void setRelegion(String relegion) {
		this.relegion = relegion;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

	public String getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(String annualincome) {
		this.annualincome = annualincome;
	}

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getPresentclass() {
		return presentclass;
	}

	public void setPresentclass(String presentclass) {
		this.presentclass = presentclass;
	}

	public String getPresentclassyear() {
		return presentclassyear;
	}

	public void setPresentclassyear(String presentclassyear) {
		this.presentclassyear = presentclassyear;
	}

	public String getModeofstudy() {
		return modeofstudy;
	}

	public void setModeofstudy(String modeofstudy) {
		this.modeofstudy = modeofstudy;
	}

	public String getClassstartdate() {
		return classstartdate;
	}

	public void setClassstartdate(String classstartdate) {
		this.classstartdate = classstartdate;
	}

	public String getUniversityname() {
		return universityname;
	}

	public void setUniversityname(String universityname) {
		this.universityname = universityname;
	}

	public String getPreviousclass() {
		return previousclass;
	}

	public void setPreviousclass(String previousclass) {
		this.previousclass = previousclass;
	}

	public String getPreviouspassingyear() {
		return previouspassingyear;
	}

	public void setPreviouspassingyear(String previouspassingyear) {
		this.previouspassingyear = previouspassingyear;
	}

	public String getPreviuosclasspercent() {
		return previuosclasspercent;
	}

	public void setPreviuosclasspercent(String previuosclasspercent) {
		this.previuosclasspercent = previuosclasspercent;
	}

	public String getRollnum10() {
		return rollnum10;
	}

	public void setRollnum10(String rollnum10) {
		this.rollnum10 = rollnum10;
	}

	public String getBoardname10() {
		return boardname10;
	}

	public void setBoardname10(String boardname10) {
		this.boardname10 = boardname10;
	}

	public String getPassingyear10() {
		return passingyear10;
	}

	public void setPassingyear10(String passingyear10) {
		this.passingyear10 = passingyear10;
	}

	public String getPrcentobt10() {
		return prcentobt10;
	}

	public void setPrcentobt10(String prcentobt10) {
		this.prcentobt10 = prcentobt10;
	}

	public String getRollnum12() {
		return rollnum12;
	}

	public void setRollnum12(String rollnum12) {
		this.rollnum12 = rollnum12;
	}

	public String getBoardname12() {
		return boardname12;
	}

	public void setBoardname12(String boardname12) {
		this.boardname12 = boardname12;
	}

	public String getPassingyear12() {
		return passingyear12;
	}

	public void setPassingyear12(String passingyear12) {
		this.passingyear12 = passingyear12;
	}

	public String getPrcentobt12() {
		return prcentobt12;
	}

	public void setPrcentobt12(String prcentobt12) {
		this.prcentobt12 = prcentobt12;
	}

	public String getAdmissionfee() {
		return admissionfee;
	}

	public void setAdmissionfee(String admissionfee) {
		this.admissionfee = admissionfee;
	}

	public String getTutionfee() {
		return tutionfee;
	}

	public void setTutionfee(String tutionfee) {
		this.tutionfee = tutionfee;
	}

	public String getOtherfee() {
		return otherfee;
	}

	public void setOtherfee(String otherfee) {
		this.otherfee = otherfee;
	}

	public String getIsdisabled() {
		return isdisabled;
	}

	public void setIsdisabled(String isdisabled) {
		this.isdisabled = isdisabled;
	}

	public String getDisabilitytype() {
		return disabilitytype;
	}

	public void setDisabilitytype(String disabilitytype) {
		this.disabilitytype = disabilitytype;
	}

	public String getDisabilitypercentage() {
		return disabilitypercentage;
	}

	public void setDisabilitypercentage(String disabilitypercentage) {
		this.disabilitypercentage = disabilitypercentage;
	}

	public String getMaritialstatus() {
		return maritialstatus;
	}

	public void setMaritialstatus(String maritialstatus) {
		this.maritialstatus = maritialstatus;
	}

	public String getParentsprofession() {
		return parentsprofession;
	}

	public void setParentsprofession(String parentsprofession) {
		this.parentsprofession = parentsprofession;
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

	public String getTaluk() {
		return taluk;
	}

	public void setTaluk(String taluk) {
		this.taluk = taluk;
	}

	public String getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(String housenumber) {
		this.housenumber = housenumber;
	}

	public String getStreetnumber() {
		return streetnumber;
	}

	public void setStreetnumber(String streetnumber) {
		this.streetnumber = streetnumber;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}
	
	
	
}
	
	
	