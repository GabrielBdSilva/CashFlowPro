package br.com.fiap.cashflowpro.controller;

import static org.springframework.http.HttpStatus.CREATED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.cashflowpro.model.Movimentacao;
import br.com.fiap.cashflowpro.repository.MovimentacaoRepository;
import jakarta.validation.Valid;


//anottation pra receber requisições e a resposta vai no corpo http
@RestController
@RequestMapping("movimentacao")
public class MovimentacaoController {
    @Autowired
    MovimentacaoRepository repository; //repository pra movimentação
    
    @PostMapping
    @ResponseStatus(CREATED)//pra codigo ser 201 quando criado uma movimentaçao
    public Movimentacao create(@RequestBody @Valid Movimentacao movimentacao) {
       
        return  repository.save(movimentacao); //esse metodo save vem do jpa (crud repository)
    } //CONTROLLER NÃO DEVE TER REGRA DE NEGOCIO!
    //A CONTROLLER SÓ É PRA CHAMAR QUEM FAZ E NÃO FAZER COISAS
    //REPOSITORY CUIDA DO ACESSO AO BANCO DE DADOS
    //NA MODEL QUE VOCE DEFINE AS REGRAS DE NEGOCIOS
    
}
