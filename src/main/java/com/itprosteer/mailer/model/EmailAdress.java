package com.itprosteer.mailer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class EmailAdress {

    private String adress;
    private String name;

}
