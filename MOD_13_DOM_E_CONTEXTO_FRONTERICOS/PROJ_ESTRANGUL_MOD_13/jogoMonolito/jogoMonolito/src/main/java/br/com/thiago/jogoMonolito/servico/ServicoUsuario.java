package br.com.thiago.jogoMonolito.servico;

import br.com.thiago.jogoMonolito.entidades.Usuario;
import br.com.thiago.jogoMonolito.repositorios.RepositorioUsuario;
import br.com.thiago.jogoMonolito.utilitarias.UsuarioUtilitaria;
import br.com.thiago.jogoMonolito.vo.UsuarioVo;
import org.springframework.stereotype.Component;

@Component

public class ServicoUsuario {
    private final RepositorioUsuario repositorioUsuario;

    public ServicoUsuario(RepositorioUsuario repositorioUsuario) {
        this.repositorioUsuario = repositorioUsuario;
    }

    public Iterable<UsuarioVo> encontrarTodos() {
       final Iterable<Usuario> usuarioIterable = repositorioUsuario.findAll();
        return UsuarioUtilitaria.toUsuarioVo(usuarioIterable);
    }
    public UsuarioVo criarUsuario(UsuarioVo usuarioVo){
        Usuario novoUsuario =  UsuarioUtilitaria.fromUsuarioVo(usuarioVo);
        novoUsuario = repositorioUsuario.save(novoUsuario);

        return  UsuarioUtilitaria.toUsuarioVo(novoUsuario);
    }
}
