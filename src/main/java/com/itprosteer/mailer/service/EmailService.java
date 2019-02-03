package com.itprosteer.mailer.service;

import com.itprosteer.mailer.model.Email;

import java.util.List;

public interface EmailService {

    void send(List<Email> emails);
}
