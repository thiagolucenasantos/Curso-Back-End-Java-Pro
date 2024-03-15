package br.com.thiago.jogoMonolito.servico;

import br.com.thiago.jogoMonolito.feign.ClienteFeignNovoUsuario;
import br.com.thiago.jogoMonolito.utilitarias.UsuarioUtilitaria;
import br.com.thiago.jogoMonolito.vo.NovoUsuarioVo;
import br.com.thiago.jogoMonolito.vo.UsuarioVo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ServicoNovoUsuario {
    private final ClienteFeignNovoUsuario clienteFeignNovoUsuario;
    public ServicoNovoUsuario(ClienteFeignNovoUsuario clienteFeignNovoUsuario) {
        this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
    }
    public UsuarioVo criarNovoUsuario(UsuarioVo usuarioVo){
        NovoUsuarioVo novoUsuarioVo = UsuarioUtilitaria.toNovoUsuarioVo(usuarioVo);
        novoUsuarioVo = clienteFeignNovoUsuario.criarNovoUsuario(novoUsuarioVo);

        return UsuarioUtilitaria.fromNovoUsuarioVo(novoUsuarioVo);
    }
    public Iterable<UsuarioVo> encontrarTodos(){
        List<NovoUsuarioVo> novosUsuariosVo = clienteFeignNovoUsuario.encontrarTodos();
        List<UsuarioVo> usuarioVo = new ArrayList<>();

        for (NovoUsuarioVo novoUsuarioVo: novosUsuariosVo){
            usuarioVo.add(UsuarioUtilitaria.fromNovoUsuarioVo(novoUsuarioVo));
        }
        return usuarioVo;
    }
}
