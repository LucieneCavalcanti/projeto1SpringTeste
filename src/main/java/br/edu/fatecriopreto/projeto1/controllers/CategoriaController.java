package br.edu.fatecriopreto.projeto1.controllers;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.fatecriopreto.projeto1.entities.CategoriaEntity;
import br.edu.fatecriopreto.projeto1.services.CategoriaService;
import br.edu.fatecriopreto.projeto1.services.CategoriaService;
import lombok.RequiredArgsConstructor;
@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriaController {
private final CategoriaService categoriaService;
    @GetMapping
    public ResponseEntity<List<CategoriaEntity>> listarTodos() {
        List<CategoriaEntity> lista = categoriaService.listarTodos();
        return ResponseEntity.ok().body(lista);
    }
}
