package com.example.demo;

public class FarbGenerator {
    public static String farbeGenerieren() {
        var farbIndex = (int)Math.floor(Math.random() * FarbenEnum.values().length);
        return FarbenEnum.values()[farbIndex].toString().toLowerCase();
    }
}
