package com.itprosteer.mailer.repository;

import com.itprosteer.mailer.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
    Client findByUsername(String username);
}
