package br.com.thiago.microusuarioAppMeme.controllers;

import br.com.thiago.microusuarioAppMeme.entities.Usuario;
import br.com.thiago.microusuarioAppMeme.services.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {

    private final ServiceUsuario usuarioService;

    @Autowired
    public ControllerUsuario(ServiceUsuario usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarTodosUsuarios();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criaNovoUsuario(usuario);
    }

    @DeleteMapping(path = "usuarios-deletar")
    public void deletarUsuarioId(Long id) {
        usuarioService.deletarUsuario(id);
    }
}
