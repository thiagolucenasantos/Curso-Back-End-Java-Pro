package br.com.thiago.jogoMonolito.controller;

import br.com.thiago.jogoMonolito.entidades.Usuario;
import br.com.thiago.jogoMonolito.servico.ServicoNovoUsuario;
import br.com.thiago.jogoMonolito.servico.ServicoUsuario;
import br.com.thiago.jogoMonolito.vo.NovoUsuarioVo;
import br.com.thiago.jogoMonolito.vo.UsuarioVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {
    private final ServicoUsuario servicoUsuario;
    private final ServicoNovoUsuario servicoNovoUsuario;

    public ControllerUsuario(ServicoUsuario servicoUsuario, ServicoNovoUsuario servicoNovoUsuario){
        this.servicoUsuario = servicoUsuario;
        this.servicoNovoUsuario = servicoNovoUsuario;
    }

    @GetMapping
    public Iterable<UsuarioVo> encontrarTodos(){
        return servicoUsuario.encontrarTodos();
    }
    @PostMapping
    public UsuarioVo criarUsuario(@RequestBody UsuarioVo usuario){
       UsuarioVo usuarioVoCriado = servicoUsuario.criarUsuario(usuario);

        UsuarioVo novoUsuarioVoCriado = servicoNovoUsuario.criarNovoUsuario(usuario);

        return usuarioVoCriado;
    }
}
