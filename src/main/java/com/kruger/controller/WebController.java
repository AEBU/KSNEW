package com.kruger.controller;

import com.kruger.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Alexis on 05/02/2018.
 */
@Controller
public class WebController {

    @GetMapping("/")
    public String goHome(){
        return "/home";
    }

}
