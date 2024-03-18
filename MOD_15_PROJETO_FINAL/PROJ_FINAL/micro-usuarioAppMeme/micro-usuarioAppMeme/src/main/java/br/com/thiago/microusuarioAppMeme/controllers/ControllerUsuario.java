package br.com.thiago.microusuarioAppMeme.controllers;

import br.com.thiago.microusuarioAppMeme.entities.Usuario;
import br.com.thiago.microusuarioAppMeme.services.ServiceUsuario;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {

    private final ServiceUsuario usuarioService;
    public ControllerUsuario(ServiceUsuario usuarioService) {
        this.usuarioService = usuarioService;
    }
        @GetMapping
        public List<Usuario> listarUsuarios(){
            return usuarioService.listarTodosUsuarios();
        }
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return usuarioService.criaNovoUsuario(usuario);
    }
}
