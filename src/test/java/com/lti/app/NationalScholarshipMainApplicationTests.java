package com.lti.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import com.lti.app.service.InstApprovalService;
import com.lti.app.service.MailService;

@SpringBootTest
class NationalScholarshipMainApplicationTests {
	
	@Autowired
	InstApprovalService insAppServ;
	
	@Autowired
	MailService mailService;

	@Test
	void getMinistApproval() {
		String id = "i002";
		insAppServ.getMinistApproval(id);
		assertEquals("Approved", "Approved");
	}
	
	
	@Test
	void sendMail() {
		mailService.sendSimpleEmail("sameer48singh@gmail.com", "Testing", "Testing");
		assertEquals("Sent", "Sent");
	}

}
