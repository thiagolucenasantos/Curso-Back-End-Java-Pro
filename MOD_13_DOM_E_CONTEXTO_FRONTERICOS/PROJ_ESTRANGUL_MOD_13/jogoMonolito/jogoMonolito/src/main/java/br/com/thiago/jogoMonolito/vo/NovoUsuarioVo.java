package br.com.thiago.jogoMonolito.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
@AllArgsConstructor

public class NovoUsuarioVo implements Serializable {

        @Getter
        private final String id;
        @Getter
        private final String nome;
        @Getter
        private final String login;
        @Getter
        private final Integer idade;

    }


