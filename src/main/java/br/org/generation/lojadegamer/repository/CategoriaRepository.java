package br.org.generation.lojadegamer.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojadegamer.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}