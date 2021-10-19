package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaveGame {
    
    @PostMapping("/game/save")
    public boolean saveGame(@RequestParam("email") String email,
                            @RequestParam("historie") String historie,
                            @RequestParam("power") int power){
        System.out.println("SaveGame");
        System.out.println(email);
        System.out.println(historie);
        System.out.println(power);
        return false;
    }

}
