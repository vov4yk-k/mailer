package com.itprosteer.mailer.controller;

import com.itprosteer.mailer.model.Email;
import com.itprosteer.mailer.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailRepository emailRepository;


    /*public EmailController(EmailRepository emailRepository) {
        this.emailRepository = emailRepository;
    }*/

    @GetMapping
    public List<Email> getMails(){
        return emailRepository.findAll();
    }

    @PostMapping
    public void setMails(@RequestBody List<Email> emails){
        emailRepository.saveAll(emails);
    }


}
