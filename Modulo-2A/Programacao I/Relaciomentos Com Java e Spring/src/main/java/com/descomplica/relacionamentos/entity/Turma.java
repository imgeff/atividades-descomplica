package com.descomplica.relacionamentos.entity;

import java.sql.Time;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "horario")
  private Time horario;

  @Column(name = "duracao")
  private Integer duracao;

  @Column(name = "dataInicio")
  private Date dataInicio;

  @Column(name = "dataFim")
  private Date dataFim;

  @ManyToOne
  @JoinColumn(name = "id_instrutor", referencedColumnName = "id")
  private Instrutor instrutor;

  public Instrutor getInstrutor() {
    return this.instrutor;
  }

  public void setInstrutor(Instrutor instrutor) {
    this.instrutor = instrutor;
  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Time getHorario() {
    return this.horario;
  }

  public void setHorario(Time horario) {
    this.horario = horario;
  }

  public Integer getDuracao() {
    return this.duracao;
  }

  public void setDuracao(Integer duracao) {
    this.duracao = duracao;
  }

  public Date getDataInicio() {
    return this.dataInicio;
  }

  public void setDataInicio(Date dataInicio) {
    this.dataInicio = dataInicio;
  }

  public Date getDataFim() {
    return this.dataFim;
  }

  public void setDataFim(Date dataFim) {
    this.dataFim = dataFim;
  }
}
