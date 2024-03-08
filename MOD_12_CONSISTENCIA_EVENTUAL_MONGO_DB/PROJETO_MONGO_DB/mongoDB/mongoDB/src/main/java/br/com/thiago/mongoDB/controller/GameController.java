package br.com.thiago.mongoDB.controller;

import br.com.thiago.mongoDB.modelo.Jogo;
import br.com.thiago.mongoDB.service.ServiceGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogos")
public class GameController {
    @Autowired
    private ServiceGame serviceGame;
    @PostMapping
    public Jogo criarJogo(@RequestBody Jogo jogo){
        return serviceGame.criarJogo(jogo);
    }

}
