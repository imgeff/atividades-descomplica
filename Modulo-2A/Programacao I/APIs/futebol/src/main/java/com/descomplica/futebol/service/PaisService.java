package com.descomplica.futebol.service;

import com.descomplica.futebol.entity.Pais;
import com.descomplica.futebol.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaisService {
    @Autowired
    PaisRepository paisRepository;

    public List<Pais> buscarTodos() {
        return this.paisRepository.findAll();
    }

    public Pais criar(Pais pais) {
        return this.paisRepository.save(pais);
    }
}
