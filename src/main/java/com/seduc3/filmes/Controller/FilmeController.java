package com.seduc3.filmes.Controller;

import com.seduc3.filmes.Entity.Filme;
import com.seduc3.filmes.Service.FilmeService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class FilmeController {

    private final FilmeService service;

    public FilmeController(FilmeService service, FilmeService service1) {

        this.service = service1;
    }

    public List<Filme> mostrarFilme(){
        return service.mostrarFilme();
    }

    @PostMapping
    public void cadastrarFilme(@RequestBody Filme J){
        service.cadastrarFilme(J);
    }

}
