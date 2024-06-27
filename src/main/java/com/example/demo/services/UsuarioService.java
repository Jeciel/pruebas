package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.PaginacionUsuario;
import com.example.demo.models.Usuario;

@Service
public class UsuarioService {

    List<Usuario> usuarios = new ArrayList<Usuario>();

    public UsuarioService() {
        this.usuarios.add(new Usuario(1, "71729154C", "Álvarez Cuartas, María", "UO220200@uniovi.es", 2, 2));
        this.usuarios.add(new Usuario(2, "9449444D", "Álvarez García, Benito", "UO221371@uniovi.es", 0, 1));
        this.usuarios
                .add(new Usuario(3, "71773518V", "Álvarez Rodríguez, Emilio Marcelino", "UO225476@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(4, "71672009F", "Álvarez Tamargo, María", "UO218844@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(5, "71682164L", "Astray Sánchez, Julio", "UO224798@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(6, "71893793W", "Barrera Cuervo, Moisés", "UO223346@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(7, "15507481F", "Blanco Cué, Graciela", "UO226133@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(8, "71673458F", "Campo Rilo, Paula Del", "UO218540@uniovi.es", 0, 1));
        this.usuarios
                .add(new Usuario(9, "71681352N", "Cortés-echánove García, Jaime María", "UO226757@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(10, "71666305F", "Díaz Ubieta, Íñigo", "UO226784@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(11, "15485873L", "Fernández Espina, Bruno", "UO217327@uniovi.es", 0, 1));
        this.usuarios
                .add(new Usuario(12, "71662724Z", "Fernández Fernández-nespral, Héctor", "UO226310@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(13, "71683706C", "Fernández Somoano, Pedro", "UO224862@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(14, "71900579A", "García Fernández, Alejandra", "UO217358@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(15, "53774496J", "García García, Beatriz", "UO225962@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(16, "32892924A", "García García, Pablo", "UO226448@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(17, "71898815X", "García González, Guillermo", "UO217103@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(18, "71676213W", "García Suárez, Adrián", "UO224395@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(19, "71677340W", "González García, Antonio", "UO218684@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(20, "15506394R", "González Tomás, Maria Adelaida", "UO201985@uniovi.es", 2, 2));
        this.usuarios.add(new Usuario(21, "71726690V", "Iglesias Santirso, Lucía", "UO213311@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(22, "71675719Z", "Martínez Álvarez, Juan Manuel", "UO224962@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(23, "71728123R", "Martínez Morán, Paula", "UO216778@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(24, "71731170N", "Mas Andrés, Virginia Maria", "UO218186@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(25, "71670003W", "Menéndez Gutiérrez, Guillermo", "UO225964@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(26, "71678465T", "Nicieza Fernández, Víctor", "UO226438@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(27, "71658022G", "Ornosa Miravalles, Peru", "UO218115@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(28, "16621498L", "Ortega Moro, Oriol", "UO213175@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(29, "71726516G", "Pérez Fernández, Fabián", "UO217690@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(30, "71676743A", "Pérez Gutiérrez, Fernando", "UO208670@uniovi.es", 2, 2));
        this.usuarios.add(new Usuario(31, "71902462T", "Quevedo Alvaré, María", "UO218730@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(32, "71682375T", "Rodríguez Alonso, David", "UO212469@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(33, "71677999V", "Rodríguez Peláez, Borja", "UO219344@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(34, "71673670N", "Rodríguez Rodríguez, Javier", "UO204336@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(35, "9406644N", "Rosal Fraga, Joaquín", "UO13346@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(36, "32891896X", "Ruiz Gómez, Miriam", "UO217527@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(37, "11445287G", "Sanz De Pedro, Héctor Miguel", "UO50725@uniovi.es", 2, 2));
        this.usuarios
                .add(new Usuario(38, "71682443E", "Serrano Fernández De Travanco, Álvaro", "UO218256@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(39, "71667762S", "Torrecillas Reig, Ramón", "UO219037@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(40, "53545810Q", "Villa Carro, Mario", "UO210010@uniovi.es", 0, 1));
        this.usuarios.add(new Usuario(41, "32890323R", "Zapico Álvarez, Jorge", "UO225895@uniovi.es", 0, 1));

    }

    public PaginacionUsuario getUsuarios(PaginacionUsuario pagination) {
        List<Usuario> resultado = usuarios;

        switch (pagination.getColumna()) {
            case "nombre":
                resultado.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
                break;
            case "identificador":
                resultado.sort((o1, o2) -> o1.getIdentificador().compareTo(o2.getIdentificador()));
                break;
            case "correo":
                resultado.sort((o1, o2) -> o1.getCorreo().compareTo(o2.getCorreo()));
                break;
            case "tipoA":
                resultado.sort((o1, o2) -> o1.getTipoA().compareTo(o2.getTipoA()));
                break;
            case "tipoB":
                resultado.sort((o1, o2) -> o1.getTipoB().compareTo(o2.getTipoB()));
                break;
            default:
                resultado.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));

        }

        if (pagination.getOrden().toUpperCase().equals("DESC")) {
            List<Usuario> reversa = new ArrayList<Usuario>();
            for (int i = resultado.size() - 1; i >= 0; i--) {
                reversa.add(resultado.get(i));
            }
            resultado = reversa;
        }

        int desde = pagination.getPagina() * pagination.getTamanio();
        int hasta = (pagination.getPagina() * pagination.getTamanio()) + pagination.getTamanio();

        if (desde > resultado.size())
            desde = resultado.size() - pagination.getTamanio();

        if (hasta > resultado.size())
            hasta = resultado.size();

        PaginacionUsuario p = pagination;
        p.setTotal(this.usuarios.size());
        p.setUsuarios(resultado.subList(desde, hasta));

        return p;
    }

}
