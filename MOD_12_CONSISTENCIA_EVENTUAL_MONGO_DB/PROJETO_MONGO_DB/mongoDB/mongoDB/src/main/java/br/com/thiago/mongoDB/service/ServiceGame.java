package br.com.thiago.mongoDB.service;

import br.com.thiago.mongoDB.modelo.Jogo;
import br.com.thiago.mongoDB.repository.RepositoryGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;

@Component
@EnableMongoRepositories(basePackageClasses = RepositoryGame.class)
public class ServiceGame {
    @Autowired
    private RepositoryGame repositoryGame;

    public Jogo criarJogo(Jogo jogo){
        return repositoryGame.insert(jogo);
    }
    public long count(){
        return repositoryGame.count();
    }
}
