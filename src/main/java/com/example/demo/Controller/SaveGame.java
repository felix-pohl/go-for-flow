package com.example.demo.Controller;

import com.example.demo.application.port.in.SaveGameUseCase;
import com.example.demo.domain.Spielstand;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SaveGame {

    private final SaveGameUseCase saveGameUseCase;

    public SaveGame(SaveGameUseCase saveGameUseCase) {
        this.saveGameUseCase = saveGameUseCase;
    }

    @PostMapping("/game/save")
    public String saveGame(@RequestParam("email") String email,
                            @RequestParam("historie") String historie,
                            @RequestParam("power") int power) {
        var spielstand = new Spielstand(email, power, historie);
        saveGameUseCase.saveGame(spielstand);
        return new ModelAndView("index");
    }

}
