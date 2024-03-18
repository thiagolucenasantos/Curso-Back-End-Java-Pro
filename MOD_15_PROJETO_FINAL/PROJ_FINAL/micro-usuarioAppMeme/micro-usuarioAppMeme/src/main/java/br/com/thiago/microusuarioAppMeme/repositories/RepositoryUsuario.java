package br.com.thiago.microusuarioAppMeme.repositories;

import br.com.thiago.microusuarioAppMeme.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryUsuario extends JpaRepository<Usuario, Long> {

}
