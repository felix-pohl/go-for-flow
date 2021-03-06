package com.example.demo.Controller;

import com.example.demo.FarbGenerator;
//import com.example.demo.MeteorDTO;
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
        addModelObjects(mav);
        mav.addObject("runden", 3);
        return mav;
    }

    @PostMapping("meteoriten")
    public ModelAndView meteoritenAuswichen(@RequestParam("meteoriten_farbe") String meteoritenFarbe,
                                            @RequestParam("farbwort") String farbwort, @RequestParam("runden") int runden) {
        ModelAndView mav = new ModelAndView("meteoriten");
        System.out.print(meteoritenFarbe);
        System.out.print(farbwort);
        if(!meteoritenFarbe.equals(farbwort)) {
            schiff.substractPower(10);    
        } 
        addModelObjects(mav);
        var verbleibendeRunden = runden - 1;
        if(verbleibendeRunden == 0){
           return new ModelAndView("kraken");
        }
        mav.addObject("runden", verbleibendeRunden);
        return mav;
    }

    private void addModelObjects(ModelAndView mav) {
        mav.addObject("schiffpower", schiff.getPower());
        mav.addObject("textfarbe", FarbGenerator.farbeGenerieren());
        mav.addObject("farbwort", FarbGenerator.farbeGenerieren());
    }

}
