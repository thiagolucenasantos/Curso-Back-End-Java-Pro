package br.com.thiago.jogoMonolito.controller;

import br.com.thiago.jogoMonolito.servico.ServicoNovoUsuario;
import br.com.thiago.jogoMonolito.vo.UsuarioVo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {
    private final ServicoNovoUsuario servicoNovoUsuario;
    public ControllerUsuario(ServicoNovoUsuario servicoNovoUsuario) {

        this.servicoNovoUsuario = servicoNovoUsuario;
    }
    @GetMapping
    public Iterable<UsuarioVo> encontrarTodos() {
        return servicoNovoUsuario.encontrarTodos();
    }

    @PostMapping
    public UsuarioVo criarUsuario(@RequestBody UsuarioVo usuario) {
       return servicoNovoUsuario.criarNovoUsuario(usuario);

    }
}
