package br.com.thiago.jogoMonolito.servico;

import br.com.thiago.jogoMonolito.entidades.Jogo;
import br.com.thiago.jogoMonolito.repositorios.RepositorioJogo;
import org.springframework.stereotype.Component;

@Component
public class ServicoJogo {
    private final RepositorioJogo repositorioJogo;

    public ServicoJogo(RepositorioJogo repositorioJogo) {
        this.repositorioJogo = repositorioJogo;
    }
    public Iterable<Jogo> encontrarTodos(){
        return repositorioJogo.findAll();
    }


}
