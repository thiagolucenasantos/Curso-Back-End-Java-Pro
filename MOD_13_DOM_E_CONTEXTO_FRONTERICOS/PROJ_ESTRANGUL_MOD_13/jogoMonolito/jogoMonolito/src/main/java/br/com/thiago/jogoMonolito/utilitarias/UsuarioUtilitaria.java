package br.com.thiago.jogoMonolito.utilitarias;

import br.com.thiago.jogoMonolito.entidades.Usuario;
import br.com.thiago.jogoMonolito.vo.NovoUsuarioVo;
import br.com.thiago.jogoMonolito.vo.UsuarioVo;

import java.util.ArrayList;
import java.util.List;

public final class UsuarioUtilitaria {
    private UsuarioUtilitaria(){}

    public static Usuario fromUsuarioVo(UsuarioVo usuarioVo){
        return new Usuario (usuarioVo.getId(), usuarioVo.getNome(), usuarioVo.getLogin(), usuarioVo.getIdade());
    }
    public static UsuarioVo toUsuarioVo(Usuario usuario){
        return new UsuarioVo (usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getIdade(), null);
    }
    public static Iterable<UsuarioVo> toUsuarioVo(Iterable<Usuario> usuarios){
        List<UsuarioVo> usuarioVoList = new ArrayList<>();

        for(Usuario usuario : usuarios){
            usuarioVoList.add(new UsuarioVo(usuario.getId(), usuario.getNome(), usuario.getLogin(), usuario.getIdade(), null));
        }
        return usuarioVoList;
    }
    public static UsuarioVo fromNovoUsuarioVo(NovoUsuarioVo novoUsuarioVo){
        UsuarioVo usuarioVo = new UsuarioVo(null, novoUsuarioVo.getNome(), novoUsuarioVo.getLogin(), novoUsuarioVo.getIdade(), null);
        usuarioVo.setIdNovoUsuario(novoUsuarioVo.getId());
        return usuarioVo;
    }
    public static NovoUsuarioVo toNovoUsuarioVo(UsuarioVo usuarioVo){
        return new NovoUsuarioVo(null, usuarioVo.getNome(), usuarioVo.getLogin(), usuarioVo.getIdade());
    }
}
