package br.edu.fatecriopreto.projeto1.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbcategorias")
public class CategoriaEntity {
    @Id //chave primária
    @GeneratedValue(strategy = 
        GenerationType.IDENTITY)
    private int id;
    private String descricao;
}
