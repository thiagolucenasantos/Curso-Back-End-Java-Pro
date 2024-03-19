package br.com.thiago.microusuarioAppMeme.services;

import br.com.thiago.microusuarioAppMeme.entities.Meme;
import br.com.thiago.microusuarioAppMeme.repositories.RepositoryMeme;
import java.util.Collections;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceMeme {
    private RepositoryMeme repositoryMeme;

    public ServiceMeme(RepositoryMeme repositoryMeme) {
        this.repositoryMeme = repositoryMeme;
    }

    public List<Meme> listarTodosMemes(){
        return repositoryMeme.findAll();
    }

    public Meme salvarMemes(Meme meme){
        return repositoryMeme.save(meme);
    }
    public void deletarMemes(Long id){
        repositoryMeme.deleteById(id);
    }
    public Meme buscarMemePorId(Long id){
        return repositoryMeme.findById(id)
                .orElseThrow(() -> new RuntimeException("Meme com o " + id + " não encontrado"));
    }

    public List<Meme> buscarMemesAleatorios(){
        List<Meme> todosMemes = repositoryMeme.findAll();
        if (todosMemes.isEmpty()){
            throw new RuntimeException("Não há memes disponíveis");
        }
        return Collections.emptyList();
    }
}
