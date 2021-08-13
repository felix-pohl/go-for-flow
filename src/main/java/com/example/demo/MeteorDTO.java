package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MeteorDTO {
    private String meteoritenFarbe;

    public String getMeteoritenFarbe() {
        return meteoritenFarbe;
    }

    public void getMeteoritenFarbe(String power) {
        this.meteoritenFarbe = power;
    }
}
