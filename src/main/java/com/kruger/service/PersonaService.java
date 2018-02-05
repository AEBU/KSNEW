package com.kruger.service;

import com.kruger.model.Persona;

import java.util.List;

/**
 * Created by Alexis on 05/02/2018.
 */
public interface PersonaService {
    Persona savePersona(Persona persona);
    List<Persona> listPersona();
}
