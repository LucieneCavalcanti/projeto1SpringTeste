package br.edu.fatecriopreto.projeto1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecriopreto.projeto1.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CategoriaService {
    //@Autowired
    private final CategoriaRepository 
    categoriaRepository;
}
