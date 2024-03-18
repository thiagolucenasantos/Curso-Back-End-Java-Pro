package br.com.thiago.microusuarioAppMeme.services;

import br.com.thiago.microusuarioAppMeme.entities.Usuario;
import br.com.thiago.microusuarioAppMeme.repositories.RepositoryUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
//@Component
public class ServiceUsuario {
    @Autowired
    private RepositoryUsuario usuarioRepository;

    public ServiceUsuario(RepositoryUsuario usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> listarTodosUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario criaNovoUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario buscarUsuarioPorId(Long id){
        return usuarioRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Usuário com " + id + "não encontrado!!"));
    }
}
