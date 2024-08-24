package com.descomplica.futebol.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "paises")
public class Pais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @OneToMany(mappedBy = "pais")
    @JsonManagedReference
    private List<Liga> ligas;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Liga> getLigas() {
        return ligas;
    }

    public void setLigas(List<Liga> ligas) {
        this.ligas = ligas;
    }
}
