package com.portfolio.siron.event;

import com.portfolio.siron.entity.Contact;
import com.portfolio.siron.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;

@Component
@RequiredArgsConstructor
public class ContactEventListener {

    private final EmailService emailService;

    @EventListener
    @Async
    public void onContact(ContactEvent event) throws MessagingException {
        final var contact = (Contact) event.getSource();

        emailService.sendEmail(contact.getEmail(), contact.getName());
    }
}
