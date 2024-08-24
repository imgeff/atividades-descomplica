package com.descomplica.futebol.service;

import com.descomplica.futebol.entity.Liga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.descomplica.futebol.repository.LigaRepository;

import java.util.List;

@Service
public class LigaService {
    @Autowired
    LigaRepository ligaRepository;

    public List<Liga> buscarTodos() {
        return this.ligaRepository.findAll();
    }

    public Liga criar(Liga liga) {
        return this.ligaRepository.save(liga);
    }
}
