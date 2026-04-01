package br.edu.fatecriopreto.projeto1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fatecriopreto.projeto1.entities.CategoriaEntity;

@Repository
public interface CategoriaRepository
extends JpaRepository<CategoriaEntity, Integer>
{

}
