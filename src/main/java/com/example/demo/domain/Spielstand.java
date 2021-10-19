package com.example.demo.domain;

public class Spielstand {

    String email;
    int power;
    String historie;

    public Spielstand(String email, int power, String historie) {
        this.email = email;
        this.power = power;
        this.historie = historie;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getHistorie() {
        return historie;
    }

    public void setHistorie(String historie) {
        this.historie = historie;
    }
}
