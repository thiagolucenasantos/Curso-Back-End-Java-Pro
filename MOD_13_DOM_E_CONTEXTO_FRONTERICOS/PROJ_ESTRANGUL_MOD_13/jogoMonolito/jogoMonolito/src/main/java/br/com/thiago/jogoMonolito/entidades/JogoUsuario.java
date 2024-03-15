package br.com.thiago.jogoMonolito.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Entity
public class JogoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn(name = "jogo_id", referencedColumnName = "id")
    private Jogo jogo;
    @Getter
    @Setter
    private String idNovoUsuario;

    public JogoUsuario() {
    }
}


