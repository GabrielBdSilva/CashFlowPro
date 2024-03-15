package br.com.fiap.cashflowpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.cashflowpro.model.Movimentacao;

//o padrao do spring é q os repo sejam interface
public interface MovimentacaoRepository extends JpaRepository<Movimentacao,Long>{
    
}
