package br.edu.fatecriopreto.projeto1.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.fatecriopreto.projeto1.entities.ProdutoEntity;
import br.edu.fatecriopreto.projeto1.repositories.ProdutoRepository;
import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class ProdutoService {
    //@Autowired
    private final ProdutoRepository 
    produtoRepository;
     public List<ProdutoEntity> listarTodos() {
        return produtoRepository.findAll();
    }
      public ProdutoEntity editar(int id, ProdutoEntity Produto) {
        // Verifique se a Produto existe
        Optional<ProdutoEntity> ProdutoExistente = 
        produtoRepository.findById(id);

        if (ProdutoExistente.isPresent()) {
            // Atualiza a Produto
            ProdutoEntity ProdutoAtualizado = ProdutoExistente.get();
            ProdutoAtualizado.setDescricao(Produto.getDescricao()); // Atualiza os campos necessários
            ProdutoAtualizado.setQuantidade(Produto.getQuantidade());
            ProdutoAtualizado.setCategoria(Produto.getCategoria());
            ProdutoAtualizado.setUnidade(Produto.getUnidade());
            ProdutoAtualizado.setValor(Produto.getValor());
            ProdutoAtualizado.setId(Produto.getId());
            return produtoRepository.save(ProdutoAtualizado); // Salva a Produto atualizada
        } else {
            // Caso a Produto não exista, retorna null
            return null;
        }
    }

    public void excluir(Integer id) {
        produtoRepository.deleteById(id);
    }

    public ProdutoEntity incluir(ProdutoEntity Produto) {
        return produtoRepository.save(Produto);
    }
}
