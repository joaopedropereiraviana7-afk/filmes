package com.seduc3.filmes.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Filme {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String genero;
    private String diretor;
    private Integer ano;
    private Integer duracao;
    private String classificacao;
    private Double nota;

    public Filme(){}

    public Filme(Long id, String titulo, String genero, String diretor, Integer ano, Integer duracao, String classificacao, Double nota) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.nota = nota;
    }

    public Filme(String titulo, String genero, String diretor, Integer ano, Integer duracao, String classificacao, Double nota) {
        this.titulo = titulo;
        this.genero = genero;
        this.diretor = diretor;
        this.ano = ano;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}

