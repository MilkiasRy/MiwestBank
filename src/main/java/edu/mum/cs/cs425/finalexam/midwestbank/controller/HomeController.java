package edu.mum.cs.cs425.finalexam.midwestbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value="/midwest/home", method= RequestMethod.GET)
    public String homepage() {
        return "midwestHomepage/index";
    }
}
