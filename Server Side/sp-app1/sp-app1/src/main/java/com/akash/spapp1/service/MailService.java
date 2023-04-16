package com.akash.spapp1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class MailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public boolean  sendMailToVerifyEmailId(String emailId) throws Exception
	{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		
		helper.setTo(emailId);
//		helper.setCc("chaurasiyakash23@gmail.com");
		helper.setSubject("this is the subject line for the html");
		helper.setText("<h1>this is the body of the mail ............... This is the text</h1>", true);
		javaMailSender.send(mime);
		return true;
	}
	
}
