package br.edu.fatecriopreto.projeto1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecriopreto.projeto1.repositories.AlunoRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class AlunoService {
    //@Autowired
    private final AlunoRepository 
    alunoRepository;
}
