package com.itprosteer.mailer.service;

import com.itprosteer.mailer.model.Email;
import com.itprosteer.mailer.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailServiceSendGrid implements EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Override
    public void send(List<Email> emails) {
        //TODO send messages througth sendgrid
    }
}
