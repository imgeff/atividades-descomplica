package com.descomplica.futebol.controller;

import com.descomplica.futebol.entity.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.descomplica.futebol.service.PaisService;

import java.util.List;

@RestController
@RequestMapping(path = "/pais")
public class PaisController {
    @Autowired
    PaisService paisService;

    @GetMapping
    public ResponseEntity<List<Pais>> buscarTodos() {
        List<Pais> paises = this.paisService.buscarTodos();

        return new ResponseEntity<>(paises, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Pais> criar(@RequestBody Pais pais) {
        Pais paisCriado = this.paisService.criar(pais);
        return new ResponseEntity<>(paisCriado, HttpStatus.CREATED);
    }
}
