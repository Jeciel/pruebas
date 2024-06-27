package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/colonia")
public class ColoniaComponent {

    @Autowired
    private ColoniaService coloniaService;

    @GetMapping("/buscar/{texto}")
    public ResponseEntity<List<Colonia>> buscar(@PathVariable String texto) {
        return new ResponseEntity<List<Colonia>>(coloniaService.searchColonia(texto), HttpStatus.OK);
    }

}
