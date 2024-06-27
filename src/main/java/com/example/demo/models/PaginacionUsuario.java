package com.example.demo.models;

import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaginacionUsuario {
    private int pagina=0; 
    private int tamanio=5; 
    private String columna=""; //Columna con la que se va a ordenar
    private String orden="ASC"; //Orden de 
    private int total=0; //Total del resultado
    private List<Usuario> usuarios=null;
}
