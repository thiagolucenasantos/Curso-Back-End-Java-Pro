package br.com.thiago.microusuarioAppMeme.controllers;

import br.com.thiago.microusuarioAppMeme.entities.Meme;
import br.com.thiago.microusuarioAppMeme.services.ServiceMeme;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping(path = "/memelandia/memes")
public class ControllerMeme {
    @Autowired
    private ServiceMeme serviceMeme;

    @GetMapping
    private List<Meme> listarMemes(){
        return serviceMeme.listarTodosMemes();
    }
    @PostMapping
    private Meme criarMeme(@RequestBody Meme meme){
        return serviceMeme.salvarMemes(meme);
    }

}
