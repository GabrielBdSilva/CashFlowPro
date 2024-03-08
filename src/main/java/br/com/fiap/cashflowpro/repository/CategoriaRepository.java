package br.com.fiap.cashflowpro.repository;
import br.com.fiap.cashflowpro.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoriaRepository extends JpaRepository<Categoria, Long> {


}
