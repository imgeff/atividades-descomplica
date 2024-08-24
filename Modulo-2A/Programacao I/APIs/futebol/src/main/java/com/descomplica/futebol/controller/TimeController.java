package com.descomplica.futebol.controller;

import com.descomplica.futebol.entity.Time;
import com.descomplica.futebol.service.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("times")
public class TimeController {
    @Autowired
    TimeService timeService;


    @GetMapping
    public ResponseEntity<List<Time>> buscarTodos() {
        List<Time> times = this.timeService.buscarTodos();

        return new ResponseEntity<>(times, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Time> criar(@RequestBody Time time) {
        Time timeCriado = this.timeService.criar(time);

        return new ResponseEntity<>(timeCriado, HttpStatus.CREATED);
    }
}
