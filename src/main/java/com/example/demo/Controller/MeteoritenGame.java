package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MeteoritenGame {

    @GetMapping("meteoriten")
    public ModelAndView meteoriten(){
        ModelAndView mav = new ModelAndView("meteoriten");

        return mav;
    }
}
