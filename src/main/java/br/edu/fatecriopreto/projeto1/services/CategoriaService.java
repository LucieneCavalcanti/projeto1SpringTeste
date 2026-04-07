package br.edu.fatecriopreto.projeto1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecriopreto.projeto1.entities.CategoriaEntity;
import br.edu.fatecriopreto.projeto1.entities.CategoriaEntity;
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
      public CategoriaEntity editar(int id, CategoriaEntity Categoria) {
        // Verifique se a Categoria existe
        Optional<CategoriaEntity> CategoriaExistente = 
        categoriaRepository.findById(id);

        if (CategoriaExistente.isPresent()) {
            // Atualiza a Categoria
            CategoriaEntity CategoriaAtualizado = CategoriaExistente.get();
            CategoriaAtualizado.setDescricao(Categoria.getDescricao()); // Atualiza os campos necessários
            CategoriaAtualizado.setId(Categoria.getId());
            return categoriaRepository.save(CategoriaAtualizado); // Salva a Categoria atualizada
        } else {
            // Caso a Categoria não exista, retorna null
            return null;
        }
    }

    public void excluir(Integer id) {
        categoriaRepository.deleteById(id);
    }

    public CategoriaEntity incluir(CategoriaEntity Categoria) {
        return categoriaRepository.save(Categoria);
    }
}
