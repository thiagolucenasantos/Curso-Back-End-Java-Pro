package br.com.thiago.animalservice.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // Adicione o relacionamento entre Funcionario e Animal
    @OneToMany(mappedBy = "funcionario")
    private List<Animal> animaisResgatados = new ArrayList<>();

    // getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Animal> getAnimaisResgatados() {
        return animaisResgatados;
    }

    public void setAnimaisResgatados(List<Animal> animaisResgatados) {
        this.animaisResgatados = animaisResgatados;
    }
}
