package br.com.thiago.jogoMonolito.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Entity
public class Jogo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "id", nullable = false)
    private Long id;
    @Getter
    @Setter
    @Column(nullable = false)
    private String nome;
    @Getter
    @Setter
    @Column(nullable = false)
    private String desenvolvedora;
    @Getter
    @Setter
    @Column(nullable = false)
    private String plataforma;

    public Jogo() {
    }
}
