//package com.akash.spapp1.config;
//
//import java.util.Properties;
//
//
//import org.springframework.mail.javamail.JavaMailSenderImpl;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.stereotype.Service;
//import jakarta.mail.internet.MimeMessage;
//
//@Service
//public class EmailConfig {
//	JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
//
//    private void prepareAndSendEmail() {
//
//        mailSender.setHost("smtp.gmail.com");
//        mailSender.setPort(465);
////          mailSender.setPort(587);
//
//        mailSender.setUsername("akashchaurasia617@gmail.com");
//        mailSender.setPassword("swdfbakwcfdjazlv");
//
//
//        Properties mailProp = mailSender.getJavaMailProperties();
//        mailProp.put("mail.transport.protocol", "smtp");
//        mailProp.put("mail.smtp.auth", "true");
//        mailProp.put("mail.smtp.starttls.enable", "true");
//        mailProp.put("mail.smtp.starttls.required", "true");
//        mailProp.put("mail.debug", "true");
//        mailProp.put("mail.smtp.ssl.enable", "true");
//
//        
//
//    }
//    
//    public boolean sendMessage(String emailId) throws Exception{
//    		prepareAndSendEmail();
//    		MimeMessage mimeMessage = mailSender.createMimeMessage();
//            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//            helper.setTo(emailId);
//            helper.setSubject("this is the subject line for the html");
//            helper.setText("<h1>this is the body of the mail............... This is the text</h1>", true);
//            mailSender.send(mimeMessage);
//            return true;
//    }
//
//}