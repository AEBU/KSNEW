package com.kruger.repository;

import com.kruger.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Alexis on 05/02/2018.
 */
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {
}
