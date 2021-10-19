package com.example.demo.adapter.out;

import com.example.demo.application.port.out.SaveGamePort;
import com.example.demo.domain.Spielstand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SaveGameAdapterJPA implements SaveGamePort {

    private final SaveGameRepository saveGameRepository;

    @Autowired
    public SaveGameAdapterJPA(SaveGameRepository repository) {
        this.saveGameRepository = repository;
    }

    @Override
    public boolean saveGame(Spielstand spielstand) {
        var entity = new SpielstandEntity(
                spielstand.getEmail(),
                spielstand.getPower(),
                spielstand.getHistorie()
        );
        saveGameRepository.save(entity);
        return true;
    }

}
