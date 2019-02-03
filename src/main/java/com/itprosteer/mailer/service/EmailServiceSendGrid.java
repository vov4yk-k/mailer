package com.itprosteer.mailer.service;

import com.itprosteer.mailer.model.Email;
import com.itprosteer.mailer.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Vova on 03.02.2019.
 */
public class EmailServiceSendGrid implements EmailService {

    @Autowired
    private EmailRepository emailRepository;

    @Override
    public void send(List<Email> emails) {

    }
}
