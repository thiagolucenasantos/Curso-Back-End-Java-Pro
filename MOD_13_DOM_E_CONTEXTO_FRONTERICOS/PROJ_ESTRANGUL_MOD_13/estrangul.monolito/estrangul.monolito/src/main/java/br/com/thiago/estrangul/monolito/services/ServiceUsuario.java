package br.com.thiago.estrangul.monolito.services;

import br.com.thiago.estrangul.monolito.entity.Usuario;
import br.com.thiago.estrangul.monolito.repositorys.RepositorysUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceUsuario {
    @Autowired
    private RepositorysUsuario repositorysUsuario;

    public Iterable<Usuario> encontrarTodos(){
         return repositorysUsuario.findAll();
    }
    public Usuario criaUsuario(Usuario usuario){
        return repositorysUsuario.save(usuario);
    }
}
