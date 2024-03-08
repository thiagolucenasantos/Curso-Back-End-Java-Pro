package br.com.thiago.mongoDB.repository;

import br.com.thiago.mongoDB.modelo.Jogo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryGame extends MongoRepository <Jogo, String>{
    long count();
}
