package com.example.demo.application.port.out;

import com.example.demo.domain.Spielstand;

public interface SaveGamePort {

    boolean saveGame(Spielstand spielstand);

}
