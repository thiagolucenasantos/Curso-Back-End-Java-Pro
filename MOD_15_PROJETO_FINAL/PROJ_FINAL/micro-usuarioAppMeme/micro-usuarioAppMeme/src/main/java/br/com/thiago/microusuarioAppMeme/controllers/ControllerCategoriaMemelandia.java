package br.com.thiago.microusuarioAppMeme.controllers;

import br.com.thiago.microusuarioAppMeme.entities.CategoriaMeme;
import br.com.thiago.microusuarioAppMeme.services.ServiceCategoriaMeme;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/memelandia")

public class ControllerCategoriaMemelandia {
    private ServiceCategoriaMeme serviceCategoriaMeme;
    private ControllerMeme controllerMeme;

    @GetMapping("/categoria_meme")
    public List<CategoriaMeme> buscaCategoria() {
        return serviceCategoriaMeme.listarTodosUsuarios();
    }

    @PostMapping("/nova-categoria")
    public CategoriaMeme novaCategoria(@RequestBody CategoriaMeme categoriaMeme) {
        return serviceCategoriaMeme.novaCategoriaMeme(categoriaMeme);
    }

}
