package br.com.thiago.jogoMonolito.controller;

import br.com.thiago.jogoMonolito.entidades.Jogo;
import br.com.thiago.jogoMonolito.servico.ServicoJogo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/jogo")
public class ControllerJogo {
private final ServicoJogo servicoJogo;

    public ControllerJogo(ServicoJogo servicoJogo){
        this.servicoJogo = servicoJogo;
    }
    @GetMapping
    public Iterable<Jogo> encontrarTodos(){
        return servicoJogo.encontrarTodos();
    }
}
