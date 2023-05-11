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
	
	public String sendMailToVerifyEmailId(String emailId, String userType) throws Exception
	{
		MimeMessage mime = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mime);
		
		helper.setTo(emailId);
//		helper.setCc("chaurasiyakash23@gmail.com");
		helper.setSubject("Activate Your Email Account");
		String activationCode = ServiceUtility.getActivationCode();
		StringBuffer text = new StringBuffer();
		text.append("<h1>Please active your email id by clicking the link bellow</h1>");
		text.append("<a href='http://localhost:9090/customer/verification/email/activationCode/" + activationCode + "'>Verify Your Email Account</a>");
		helper.setText(text.toString(), true);
		javaMailSender.send(mime);
		return activationCode;
	}
	
}
