package br.edu.fatecriopreto.projeto1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecriopreto.projeto1.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ProdutoService {
    //@Autowired
    private final ProdutoRepository 
    produtoRepository;
}
