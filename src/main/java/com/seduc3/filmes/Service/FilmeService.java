package com.seduc3.filmes.Service;

import com.seduc3.filmes.Entity.Filme;
import com.seduc3.filmes.Repository.FilmeRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmeService{


    private final FilmeRepository repository;

    public FilmeService(FilmeRepository repository) {
        this.repository = repository;
    }

    public List<Filme> mostrarFilme(){
        List<Filme> filmeList = new ArrayList<>();
        return filmeList = repository.findAll();

    }
    public void cadastrarFilme (Filme J){
        Filme filme = new Filme();
        filme.setTitulo(J.getTitulo());
        filme.setGenero(J.getGenero());
        filme.setDiretor(J.getDiretor());
        filme.setAno(J.getAno());
        filme.setDuracao(J.getDuracao());
        filme.setClassificacao(J.getClassificacao());
        filme.setNota(J.getNota());


    }

}

