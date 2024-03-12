package br.com.thiago.jogoMonolito.repositorios;

import br.com.thiago.jogoMonolito.entidades.Jogo;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioJogo extends CrudRepository<Jogo, Long> {
}
