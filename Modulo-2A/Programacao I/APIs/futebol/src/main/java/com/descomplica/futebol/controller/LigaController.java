package com.descomplica.futebol.controller;

import com.descomplica.futebol.entity.Liga;
import com.descomplica.futebol.service.LigaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ligas")
public class LigaController {
    @Autowired
    LigaService ligaService;

    @GetMapping
    public ResponseEntity<List<Liga>> buscarTodos() {
        List<Liga> ligas = this.ligaService.buscarTodos();

        return new ResponseEntity<>(ligas, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Liga> criar(@RequestBody Liga liga) {
        Liga ligaCriada = this.ligaService.criar(liga);

        return new ResponseEntity<>(ligaCriada, HttpStatus.CREATED);
    }
}
