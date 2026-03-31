package br.edu.fatecriopreto.projeto1.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //setter e getter
@AllArgsConstructor //construtor com todos os atributos
@NoArgsConstructor //construtor sem argumentos
@Entity
@Table(name = "tbalunos")
public class AlunoEntity {
    @Id //chave primária
    @GeneratedValue(strategy = 
        GenerationType.IDENTITY)
    private int RA;
    @Column(length = 200, nullable = false) //definindo o tamanho máximo e se pode ser nulo
    private String nome;
    @Column(length = 100, nullable = false)
    private String email;
    @Column(length = 100, nullable = false)
    private String curso;
}
