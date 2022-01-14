package com.portfolio.siron.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Document
@AllArgsConstructor
public class Contact {

    @Id
    private String _id;

    @NotBlank
    private String subject;

    @NotBlank
    private String name;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String message;

    private final String receiver = "sironshakya10@gmail.com";



}
