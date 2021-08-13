package com.example.demo.Controller;

import com.example.demo.MeteorDTO;
import com.example.demo.SchiffDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        mav.addObject("textfarbe", "rot");
        mav.addObject("farbwort", "blau");
        return mav;
    }

    @PostMapping("meteoriten")
    public ModelAndView meteoritenAuswichen(@RequestParam("meteoriten_farbe") String meteoritenFarbe,
                                            @RequestParam("farbwort") String farbwort) {
        ModelAndView mav = new ModelAndView("meteoriten");
        System.out.print(meteoritenFarbe);
        System.out.print(farbwort);
        if(!meteoritenFarbe.equals(farbwort)) {
            schiff.setPower(schiff.getPower()-10);
            mav.addObject("schiffpower", schiff.getPower());
        }

        return mav;
    }
}
