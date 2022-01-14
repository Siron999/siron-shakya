package com.portfolio.siron.service;

import com.portfolio.siron.entity.Contact;
import com.portfolio.siron.event.ContactEvent;
import com.portfolio.siron.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;

@RequiredArgsConstructor
@Service
public class ContactService {
    private final ContactRepository contactRepository;
    private final ApplicationEventPublisher publisher;


    public void save(Contact contact) {
        contactRepository.save(contact);
        publisher.publishEvent(new ContactEvent(contact));
    }

}
