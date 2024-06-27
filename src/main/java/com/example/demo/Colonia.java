package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Colonia {

    private int id;
    private String nombre;
    
    public Colonia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    
}
