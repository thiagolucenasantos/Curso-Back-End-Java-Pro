--Criando a tabela automaticamente gerada da nossa entidade Animal, utilizando o schema.sql
--CREATE TABLE animal (
--  id INT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
--   nome_provisorio VARCHAR(255) NOT NULL,
--   idade_estimada INT NOT NULL,
--   raca VARCHAR(255) NOT NULL,
--   data_entrada date NOT NULL,
--   data_adocao date,
--   condicoes_chegada VARCHAR(255) NOT NULL,
--   nome_recebedor VARCHAR(255) NOT NULL,
--   data_obito date,
--   porte VARCHAR(255) NOT NULL,
--   tipo_animal VARCHAR(255) NOT NULL,
--   CONSTRAINT pk_animal PRIMARY KEY (id)
--);
--CREATE TABLE funcionario (
--  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
--   nome VARCHAR(255),
--   CONSTRAINT pk_funcionario PRIMARY KEY (id)
--);
CREATE TABLE funcionario (
  id BIGINT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   nome VARCHAR(255),
   CONSTRAINT pk_funcionario PRIMARY KEY (id)
);
CREATE TABLE animal (
  id INT GENERATED BY DEFAULT AS IDENTITY NOT NULL,
   nome_provisorio VARCHAR(255) NOT NULL,
   idade_estimada INT NOT NULL,
   raca VARCHAR(255) NOT NULL,
   data_entrada date NOT NULL,
   data_adocao date,
   condicoes_chegada VARCHAR(255) NOT NULL,
   nome_recebedor VARCHAR(255) NOT NULL,
   data_obito date,
   porte VARCHAR(255) NOT NULL,
   tipo_animal VARCHAR(255) NOT NULL,
   funcionario_id BIGINT,
   CONSTRAINT pk_animal PRIMARY KEY (id)
);

ALTER TABLE animal ADD CONSTRAINT FK_ANIMAL_ON_FUNCIONARIO FOREIGN KEY (funcionario_id) REFERENCES funcionario (id);