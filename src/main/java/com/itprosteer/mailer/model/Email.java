package com.itprosteer.mailer.model;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
public class Email {

    @Id
    private ObjectId id;
    private EmailAdress from;
    private EmailAdress to;
    private String body;

}
