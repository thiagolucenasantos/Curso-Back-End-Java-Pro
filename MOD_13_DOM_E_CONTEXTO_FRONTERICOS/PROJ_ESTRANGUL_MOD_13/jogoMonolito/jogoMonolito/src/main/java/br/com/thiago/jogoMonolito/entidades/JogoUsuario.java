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
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;
    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "jogo_id", referencedColumnName = "id")
    private Jogo jogo;

    public JogoUsuario() {
    }
}


