package br.edu.fatecriopreto.projeto1.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = 
        GenerationType.IDENTITY)
    private int id;
    private String descricao;
    private double valor;
    private double quantidade;
    @Column(length = 2, nullable = false)
    private String unidade;
    @ManyToOne
    @JoinColumn(name="idcategoria", nullable = false)
    private CategoriaEntity categoria;
}
