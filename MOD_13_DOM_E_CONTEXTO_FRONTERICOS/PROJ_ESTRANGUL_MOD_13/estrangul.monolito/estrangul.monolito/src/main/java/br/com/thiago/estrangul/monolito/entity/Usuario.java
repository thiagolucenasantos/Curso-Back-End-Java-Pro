package br.com.thiago.estrangul.monolito.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String nome;
    @Getter
    @Setter
    private String login;
    @Getter
    @Setter
    private Integer idade;
    @Getter
    @Setter
    private Integer alturaCm;

    //o hibernate sempre irá setar esse ID antes de tudo para a criação,é para fazer o autogenerate na mão, mas existe outras opções de se fazer
    @PrePersist
    public void criaId() {
        this.id = UUID.randomUUID().toString();
    }
}
