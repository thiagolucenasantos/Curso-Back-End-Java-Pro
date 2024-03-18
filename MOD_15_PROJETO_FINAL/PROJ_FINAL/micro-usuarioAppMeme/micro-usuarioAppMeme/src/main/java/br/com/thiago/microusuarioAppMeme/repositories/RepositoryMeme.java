package br.com.thiago.microusuarioAppMeme.repositories;

import br.com.thiago.microusuarioAppMeme.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryMeme extends JpaRepository<Meme, Long> {
}
