package com.descomplica.relacionamentos.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "instrutor")
public class Instrutor {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "RG")
  private Integer rg;

  @Column(name = "nome")
  private String nome;

  @Column(name = "nascimento")
  private Date nascimento;

  @Column(name = "titulacao")
  private Integer titulacao;

  @OneToMany(mappedBy = "instrutor")
  private Set<Turma> turmas;

  public Set<Turma> getTurmas() {
    return this.turmas;
  }

  public void setTurmas(Set<Turma> turmas) {
    this.turmas = turmas;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getRg() {
    return this.rg;
  }

  public void setRg(Integer rg) {
    this.rg = rg;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getNascimento() {
    return this.nascimento;
  }

  public void setNascimento(Date nascimento) {
    this.nascimento = nascimento;
  }

  public Integer getTitulacao() {
    return this.titulacao;
  }

  public void setTitulacao(Integer titulacao) {
    this.titulacao = titulacao;
  }

}
