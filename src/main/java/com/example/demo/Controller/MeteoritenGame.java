package com.example.demo.Controller;

import com.example.demo.SchiffDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MeteoritenGame {

    SchiffDTO schiff;

    @Autowired
    public void setSchiff(SchiffDTO schiff){
        this.schiff = schiff;
    }

    @GetMapping("meteoriten")
    public ModelAndView meteoriten(){
        ModelAndView mav = new ModelAndView("meteoriten");
        mav.addObject("schiffpower", schiff.getPower());
        return mav;
    }
}
