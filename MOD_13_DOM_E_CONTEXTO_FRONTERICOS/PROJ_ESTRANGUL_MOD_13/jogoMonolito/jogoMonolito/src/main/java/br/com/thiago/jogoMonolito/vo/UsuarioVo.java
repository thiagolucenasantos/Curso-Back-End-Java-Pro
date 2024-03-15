package br.com.thiago.jogoMonolito.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@AllArgsConstructor

public class UsuarioVo implements Serializable {
    @Getter
    private final Long id;
    @Getter
    private final String nome;
    @Getter
    private final String login;
    @Getter
    private final Integer idade;
    @Getter
    @Setter
    private String idNovoUsuario;
    @Getter
    @Setter
    private Integer alturaCm;

}
