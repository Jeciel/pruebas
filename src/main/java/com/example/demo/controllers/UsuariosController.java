package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.PaginacionUsuario;
import com.example.demo.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuariosController {
    
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/buscar")
    public ResponseEntity<PaginacionUsuario> buscar(@RequestBody PaginacionUsuario paginacion) {
        
        return new ResponseEntity<PaginacionUsuario>(usuarioService.getUsuarios(paginacion), HttpStatus.OK);
    }
}
