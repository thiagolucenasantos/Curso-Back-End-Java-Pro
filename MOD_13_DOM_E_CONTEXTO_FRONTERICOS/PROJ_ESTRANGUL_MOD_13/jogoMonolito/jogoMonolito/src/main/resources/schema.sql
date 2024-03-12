
CREATE TABLE jogo (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   nome VARCHAR(255) NOT NULL,
   desenvolvedora VARCHAR(255) NOT NULL,
   plataforma VARCHAR(255) NOT NULL,
   CONSTRAINT pk_jogo PRIMARY KEY (id)
);
CREATE TABLE usuario (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   nome VARCHAR(255),
   login VARCHAR(255),
   idade VARCHAR(255),
   CONSTRAINT pk_usuario PRIMARY KEY (id)
);
CREATE TABLE jogo_usuario (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   usuario_id BIGINT,
   jogo_id BIGINT,
   CONSTRAINT pk_jogousuario PRIMARY KEY (id)
);

ALTER TABLE jogo_usuario ADD CONSTRAINT uc_jogousuario_jogo UNIQUE (jogo_id);

ALTER TABLE jogo_usuario ADD CONSTRAINT FK_JOGOUSUARIO_ON_JOGO FOREIGN KEY (jogo_id) REFERENCES jogo (id);

ALTER TABLE jogo_usuario ADD CONSTRAINT FK_JOGOUSUARIO_ON_USUARIO FOREIGN KEY (usuario_id) REFERENCES usuario (id);