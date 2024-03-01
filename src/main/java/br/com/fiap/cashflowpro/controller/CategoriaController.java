package br.com.fiap.cashflowpro.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.fiap.cashflowpro.model.Categoria;

@Controller
public class CategoriaController {

    Logger log = LoggerFactory.getLogger(getClass());

    List<Categoria> repository = new ArrayList<>();

    @RequestMapping(method=RequestMethod.GET , path="/categoria")//n precisa mais d: produces = "application/json"
    @ResponseBody
    public List<Categoria> index(){
        return repository;
    }

    @RequestMapping(method=RequestMethod.POST ,path="/categoria")
    @ResponseBody
    public void create(){
log.info("cadastrando categoria");
    }
}
