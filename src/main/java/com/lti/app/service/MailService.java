package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void sendSimpleEmail(String toEmail, String body, String subject) {
		
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("national.scholarship.noreply@gmail.com");
		message.setTo(toEmail);
		message.setText(body);
		message.setSubject(subject);
		
		javaMailSender.send(message);
		System.out.println("Sent");
	}

}
