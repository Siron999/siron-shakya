package com.portfolio.siron.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@RequiredArgsConstructor
@Service
public class EmailService {

    private final JavaMailSender javaMailSender;

    @Value("${spring.mail.username}")
    private String from;

    public void sendEmail(String to, String name) throws MessagingException {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
            helper.setTo(to);
            helper.setFrom(from);
            helper.setSubject("Message Received");
            helper.setText(buildEmail(name), true);
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            throw new MessagingException("Could not send Email");
        }
    }

    private String buildEmail(String name) {
        return "<div style=\"color:black;\">Hello " + name + ",<br><span style=\"color:black;\">This email confirms that i have received your email. You will hear back from me soon</span>.<br><span style=\"color:black;\">Thank you.</span></div>";
    }
}
