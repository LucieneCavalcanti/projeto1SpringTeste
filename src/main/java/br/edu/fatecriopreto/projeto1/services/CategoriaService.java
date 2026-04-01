package br.edu.fatecriopreto.projeto1.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecriopreto.projeto1.entities.CategoriaEntity;
import br.edu.fatecriopreto.projeto1.entities.ProdutoEntity;
import br.edu.fatecriopreto.projeto1.repositories.CategoriaRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class CategoriaService {
    //@Autowired
    private final CategoriaRepository 
    categoriaRepository;
         public List<CategoriaEntity> listarTodos() {
        return categoriaRepository.findAll();
    }
}
