package com.example.demo.application.port.in;

import com.example.demo.domain.Spielstand;

public interface SaveGameUseCase {

    boolean saveGame(Spielstand spielstand);

}
