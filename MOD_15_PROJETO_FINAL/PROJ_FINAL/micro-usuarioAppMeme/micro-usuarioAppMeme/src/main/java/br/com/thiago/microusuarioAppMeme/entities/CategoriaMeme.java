package br.com.thiago.microusuarioAppMeme.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;


@Entity
public class CategoriaMeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long id;
    @Column(name = "nome", nullable = false)
    public String nome;
    @Column(name = "descricao", nullable = false)
    public String descricao;

    @Column(name = "data_cadastro", nullable = false)
    public Date dataCadastro;
    @OneToMany(mappedBy = "categoriaMeme")
    private List<Meme> memes;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
