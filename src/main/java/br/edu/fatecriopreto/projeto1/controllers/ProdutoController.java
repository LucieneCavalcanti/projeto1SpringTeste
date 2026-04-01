package br.edu.fatecriopreto.projeto1.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecriopreto.projeto1.entities.ProdutoEntity;
import br.edu.fatecriopreto.projeto1.services.ProdutoService;
import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {
private final ProdutoService ProdutoService;
    @GetMapping
    public ResponseEntity<List<ProdutoEntity>> listarTodos() {
        List<ProdutoEntity> lista = ProdutoService.listarTodos();
        return ResponseEntity.ok().body(lista);
    }
}
