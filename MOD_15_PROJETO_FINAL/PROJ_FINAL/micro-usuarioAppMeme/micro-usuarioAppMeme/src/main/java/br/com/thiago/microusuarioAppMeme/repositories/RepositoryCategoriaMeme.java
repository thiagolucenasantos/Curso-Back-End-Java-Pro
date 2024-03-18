package br.com.thiago.microusuarioAppMeme.repositories;

import br.com.thiago.microusuarioAppMeme.entities.CategoriaMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCategoriaMeme extends JpaRepository<CategoriaMeme, Long> {
}
