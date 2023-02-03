package com.lti.app.Controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.text.RandomStringGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.app.dto.Imagedto;
import com.lti.app.pojo.Image;
import com.lti.app.pojo.Institute;
import com.lti.app.pojo.InstituteApprovalStatus;
import com.lti.app.pojo.Ministry;
import com.lti.app.pojo.Nodal;
import com.lti.app.pojo.Scholarship;
import com.lti.app.pojo.ScholarshipApproval;
import com.lti.app.pojo.Student;
import com.lti.app.service.ImageService;
import com.lti.app.service.InstApprovalService;
import com.lti.app.service.InstituteService;
import com.lti.app.service.MailService;
import com.lti.app.service.MinistryService;
import com.lti.app.service.NodalService;
import com.lti.app.service.ScholarAppService;
import com.lti.app.service.ScholarshipService;
import com.lti.app.service.StudentService;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest/api")
@CrossOrigin("http://localhost:4200")
public class RestController {
	
	@Autowired
	StudentService studService;
	
	@Autowired
	InstituteService instService;
	
	@Autowired
	NodalService nodalService;
	
	@Autowired
	MinistryService ministryService;
	
	@Autowired
	ScholarshipService scholarshipService;
	
	@Autowired
	InstApprovalService instAppServ;
	
	@Autowired
	ScholarAppService scAppServ;
	

	@Autowired
	ImageService imgService;
	
	
	//Student--------------------------
	@GetMapping("/student")
	public List<Student> showAllStudent(){
		return studService.showAllStudent();
	}
	
	@PostMapping("/student")
	public boolean addStudent(@RequestBody Student student) {
		studService.addStudent(student);
		return true;
	}
	
	@PutMapping("/student")
	public boolean updateStudent(@RequestBody Student student) {
		studService.updateStudent(student);
		return true;
	}
	@GetMapping("/student/{uniqid}")
	public Student findStudent(@PathVariable(name="uniqid") String uniqid)
	{
		return studService.searchStudentById(uniqid);
	}
	
	//Institute-------------------------------
	@PostMapping("/institute")
	public boolean addInstitute(@RequestBody Institute inst) {
		instService.addInstitute(inst);
		return true;
	}
	
	@GetMapping("/institute/{instid}")
	public Institute findInstitute(@PathVariable(name="instid") String instid)
	{	
		return instService.searchInstitue(instid);
	}
	
	@GetMapping("/institutedetails/{instid}")
	public Institute getInstituteDetails(@PathVariable(name="instid") String instid)
	{
		return instService.getInstitute(instid);
	}
	
	@GetMapping("/institute")
	public List<Institute> getInstitute(){
		return instService.getInstitute();
	}
	
	//Nodal------------------------------------
	@GetMapping("/nodal/{userid}")
	public Nodal findNodal(@PathVariable(name="userid") String userid)
	{
		return nodalService.searchNodalById(userid);
	}
	
	//Ministry---------------------------------
	@GetMapping("/ministry/{userid}")
	public Ministry findMinistry(@PathVariable(name="userid") String userid)
	{
		return ministryService.searchMinistryById(userid);
	}
	
	//Scholarship-------------------------------
	@PostMapping("/scholarship")
	public boolean addData(@RequestBody Scholarship sch)
	{
		scholarshipService.addData(sch);
		return true;
	}
	
	@GetMapping("/scholarship")
	public List<Scholarship> getScholarship(){
		return scholarshipService.getData();
	}
	
	@GetMapping("/scholarshipdetails/{uniqid}")
	public Scholarship getScholarDetails(@PathVariable(name="uniqid") String uniqid) {
		return scholarshipService.getScholarDetails(uniqid);
	}
	
	@GetMapping("/instwisescholar/{institutename}")
	public List<Scholarship> getInstwiseScholar(@PathVariable(name="institutename") String instname){
		return scholarshipService.instWiseScholar(instname);
	}
	
	
	//InstituteApproval--------------------------
	@GetMapping("/instituteapproval/{instid}")
	public InstituteApprovalStatus getInstituteApproval(@PathVariable(name="instid") String instid)
	{
		return instAppServ.getInstApp(instid);
	}
	
	@PutMapping("/instituteapproval")
	public boolean updateNodalStatus(@RequestBody InstituteApprovalStatus insta) {
		instAppServ.setNodalStat(insta);
		return true;
	}
	
	//ScholarApprovale-------------------------
	@GetMapping("/scholarapproval/{uniqid}")
	public ScholarshipApproval getScholarApproval(@PathVariable(name="uniqid") String uniqid)
	{
		return scAppServ.getScholarApp(uniqid);
	}
	
	@PutMapping("/scholarapproval")
	public boolean updateScholarApp(@RequestBody ScholarshipApproval insta) {
		scAppServ.updateStat(insta);
		return true;
	}
	
	//DocumentsImages------------------------------
	
	@PostMapping("/image")
	public boolean upload(Imagedto imagedto) {
		String imageUploadLocation = "D:/projectGladiator/Project Gladiator/FrontEnd/NationalScholarship/src/assets/";
		String fileName = imagedto.getFile().getOriginalFilename();
		String targetFile = imageUploadLocation + imagedto.getName();
		try {
			FileCopyUtils.copy(imagedto.getFile().getInputStream(), new FileOutputStream(targetFile));
		} catch (IOException e) {
			return false;
		}

		Image image = new Image();
		image.setImage(imagedto.getName());
		image.setUniqid(imagedto.getUniqid());
		imgService.addImage(image);
		return true;
	}
	
	//Mail services----------------------
	
	@Autowired
	private MailService service;
	
	@GetMapping("/forgetpass/{uniqid}")
	public boolean triggerMail(@PathVariable(name="uniqid") String uniqid) {
		Student st=studService.searchStudentById(uniqid);
		RandomStringGenerator rsg = new RandomStringGenerator.Builder()
			    .selectFrom("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray())
			    .build();
		String newPass=rsg.generate(10);
		String toMail = st.getEmail();
		st.setPassword(newPass);
		studService.updateStudent(st);
		service.sendSimpleEmail(toMail, "Your new password set to : "+newPass, "National Scholarship New Password");
		return true;
	}
	
	@GetMapping("/informinst/{instid}")
	public boolean informInst(@PathVariable(name="instid") String instid) {
		Institute in = instService.searchInstitue(instid);
		service.sendSimpleEmail(in.getInstmail(), "Your Institute has been aprroved for National Scholarship Portal now you can login on portal.", "Approval from Natioanl Scholarship");
		return true;
	}

}
