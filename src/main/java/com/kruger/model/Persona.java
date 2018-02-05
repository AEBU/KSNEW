package com.kruger.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created by Alexis on 05/02/2018.
 */

@Entity
@Table(name="persona")
public class Persona implements Serializable{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "per_id")
    private Integer id;

    @Column(name = "per_dir")
    private String direccion;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
