package br.com.thiago.jogoMonolito.utilitarias;

import br.com.thiago.jogoMonolito.entidades.Usuario;
import br.com.thiago.jogoMonolito.vo.NovoUsuarioVo;
import br.com.thiago.jogoMonolito.vo.UsuarioVo;

import java.util.ArrayList;
import java.util.List;

public final class UsuarioUtilitaria {
    private UsuarioUtilitaria(){}
 public static UsuarioVo fromNovoUsuarioVo(NovoUsuarioVo novoUsuarioVo){
        UsuarioVo usuarioVo = new UsuarioVo(null, novoUsuarioVo.getNome(), novoUsuarioVo.getLogin(), novoUsuarioVo.getIdade(), novoUsuarioVo.getId(), novoUsuarioVo.getAlturaCm());
        usuarioVo.setIdNovoUsuario(novoUsuarioVo.getId());
        usuarioVo.setAlturaCm(novoUsuarioVo.getAlturaCm());
        return usuarioVo;
    }
    public static NovoUsuarioVo toNovoUsuarioVo(UsuarioVo usuarioVo){
       NovoUsuarioVo novoUsuarioVo =  new NovoUsuarioVo(null, usuarioVo.getNome(), usuarioVo.getLogin(), usuarioVo.getIdade(), usuarioVo.getAlturaCm());
       novoUsuarioVo.setAlturaCm(usuarioVo.getAlturaCm());
       return novoUsuarioVo;

    }
}
