package br.com.thiago.microusuarioAppMeme.services;

import br.com.thiago.microusuarioAppMeme.entities.CategoriaMeme;
import br.com.thiago.microusuarioAppMeme.repositories.RepositoryCategoriaMeme;
import br.com.thiago.microusuarioAppMeme.repositories.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceCategoriaMeme {
//    @Autowired
//    private RepositoryUsuario usuarioRepository;
    @Autowired
    private RepositoryCategoriaMeme categoriaMemeRepository;

    public ServiceCategoriaMeme(RepositoryUsuario usuarioRepository, RepositoryCategoriaMeme categoriaMemeRepository) {
//        this.usuarioRepository = usuarioRepository;
        this.categoriaMemeRepository = categoriaMemeRepository;
    }

//    @Autowired
//    private MemeRepository memeRepository;

    public List<CategoriaMeme> listarTodosUsuarios(){
        return categoriaMemeRepository.findAll();
    }
    public CategoriaMeme novaCategoriaMeme(CategoriaMeme categoriaMeme){
        return categoriaMemeRepository.save(categoriaMeme);
    }
    public void deletarCategoriaMeme(Long id){
        categoriaMemeRepository.deleteById(id);
    }
    public CategoriaMeme buscarCategoriaMemePorId(Long id) {
        return categoriaMemeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria de Meme não encontrada com o ID: " + id));
    }

}
