package com.seduc3.filmes.Repository;

import com.seduc3.filmes.Entity.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface FilmeRepository extends JpaRepository<Filme, Long>{

    }

