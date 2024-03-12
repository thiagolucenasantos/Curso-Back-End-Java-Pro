package br.com.thiago.estrangul.monolito.controllers;

import br.com.thiago.estrangul.monolito.entity.Usuario;
import br.com.thiago.estrangul.monolito.services.ServiceUsuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/usuarios")
public class ControllerUsuario {
    private final ServiceUsuario serviceUsuario;

    public ControllerUsuario(ServiceUsuario serviceUsuario) {
        this.serviceUsuario = serviceUsuario;
    }
    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario){
        return serviceUsuario.criaUsuario(usuario);
    }
    @GetMapping
    public Iterable<Usuario> encontrarTodos(){
        return serviceUsuario.encontrarTodos();
    }
}
