package com.portfolio.siron.controller;

import com.portfolio.siron.entity.Contact;
import com.portfolio.siron.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RequiredArgsConstructor
@RestController
@RequestMapping("contact")
public class ContactController {

    private final ContactService contactService;

    @RequestMapping(path = "", method = POST, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<String> contactMe(@Valid @ModelAttribute Contact contact) {
        contactService.save(contact);
        return ResponseEntity.status(201).body("OK");
    }
}
