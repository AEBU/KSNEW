package com.kruger.service;

import com.kruger.model.Persona;
import com.kruger.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alexis on 05/02/2018.
 */
@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Persona savePersona(Persona persona) {
       return personaRepository.save(persona);
    }

    @Override
    public List<Persona> listPersona() {
        return personaRepository.findAll();
    }

}
