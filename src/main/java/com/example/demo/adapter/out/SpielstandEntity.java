package com.example.demo.adapter.out;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpielstandEntity {

    @Id
    private String email;

    private int power;

    private String historie;

    public SpielstandEntity() {
    }

    public SpielstandEntity(String email, int power, String historie) {
        this.email = email;
        this.power = power;
        this.historie = historie;
    }

}
