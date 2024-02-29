package br.com.thiago.animalservice.controllers;

import br.com.thiago.animalservice.entidades.Animal;
import br.com.thiago.animalservice.repositorios.AnimalRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // anotação mostra que ele é um controller
@RequestMapping("/animais")
public class AnimalController {
    private AnimalRepository repository;

    public AnimalController(AnimalRepository repository){
        this.repository = repository;
    }

    //retorna todos os animais cadastrados
    @GetMapping
    private List<Animal> findAll(){
        return repository.findAll();
    }

    //criando end point para salvar os animais na nossa base de dados
    @PostMapping
    private Animal create(@RequestBody Animal animal){
        return repository.save(animal);
    }

    //utilizando o método para encontrar os cachorros por order do mais velho para o mais novo
    @GetMapping("/not-adopted")
        private List<Animal> findNotAdopted(){
            return repository.findNotAdopted();
        }

        //uilizando o método para encontrar os adotados
    @GetMapping("/adopted")
    private List<Animal> findAdopted(){
        return repository.findAdopted();
    }

    @GetMapping("/find-cachorro")
    private List<Animal> findTypeCachorros(){
        return repository.findTypeCachorros();
    }

    @GetMapping("/find-gato")
    private List<Animal> findTypeGatos(){
        return repository.findTypeGatos();
    }

}
