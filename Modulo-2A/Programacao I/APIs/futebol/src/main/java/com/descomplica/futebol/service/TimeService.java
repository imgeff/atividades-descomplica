package com.descomplica.futebol.service;

import com.descomplica.futebol.repository.TimeRepository;
import com.descomplica.futebol.entity.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeService {
    @Autowired
    TimeRepository timeRepository;

    public List<Time> buscarTodos() {
        return this.timeRepository.findAll();
    }

    public Time criar(Time time) {
        return this.timeRepository.save(time);
    }
}
