package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SchiffDTO {
    private int power=100;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
