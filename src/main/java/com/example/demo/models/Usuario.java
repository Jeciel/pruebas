package com.example.demo.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Usuario {
    private int id;
    private String nombre;
    private String identificador;
    private String correo;
    private int idTipoA;
    private int idTipoB;
    private String tipoA;
    private String tipoB;

    public Usuario(int id, String identificador, String nombre, String correo, int idTipoA, int idTipoB) {
        this.id = id;
        this.nombre = nombre;
        this.identificador = identificador;
        this.correo = correo;
        this.idTipoA = idTipoA;
        this.tipoB = idTipoB + "";
        this.tipoA = idTipoA + "";
    }

}
