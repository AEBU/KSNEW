package com.kruger.controller;

import com.kruger.model.Persona;
import com.kruger.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Alexis on 05/02/2018.
 */
@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping(value = "/persona/create")
    public String createPersona(Model model){
        model.addAttribute("persona",new Persona());
        return "/form";
    }


    @RequestMapping(value = "/persona/listar")
    public String listPersonas(Model model){
        model.addAttribute("personas",personaService.listPersona()  );
        return "/list";
    }


    @RequestMapping(value = "/persona/save",method = RequestMethod.POST)
    public String savePersona(Persona persona){
        Persona pers=personaService.savePersona(persona);
        System.out.println(pers);
        return "redirect:/";
    }

}
