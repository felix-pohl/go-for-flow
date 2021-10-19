package com.example.demo.application.service;

import com.example.demo.domain.Spielstand;
import com.example.demo.application.port.in.SaveGameUseCase;
import com.example.demo.application.port.out.SaveGamePort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveGameService implements SaveGameUseCase {

    private final SaveGamePort saveGamePort;

    @Autowired
    public SaveGameService(SaveGamePort saveGamePort) {
        this.saveGamePort = saveGamePort;
    }

    @Override
    public boolean saveGame(Spielstand spielstand) {
        return saveGamePort.saveGame(spielstand);
    }
}
