package br.com.thiago.jogoMonolito.repositorios;

import br.com.thiago.jogoMonolito.entidades.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface RepositorioUsuario extends CrudRepository<Usuario, Long> {
}
