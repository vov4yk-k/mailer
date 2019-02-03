package com.itprosteer.mailer.repository;

import com.itprosteer.mailer.model.Email;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmailRepository extends MongoRepository<Email, String> {

}
