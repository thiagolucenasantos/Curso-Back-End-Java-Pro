package br.com.thiago.microusuarioAppMeme.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;


@Entity
public class CategoriaMeme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_cadastro", nullable = false)
    private Date dataCadastro;
    @OneToMany(mappedBy = "categoriaMeme")
    private List<Meme> memes;

    public CategoriaMeme(){}

    public CategoriaMeme(Long id, String nome, String descricao, Date dataCadastro, List<Meme> memes) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.memes = memes;
    }
    public List<Meme> getMemes() {
        return memes;
    }


    public void setMemes(List<Meme> memes) {
        this.memes = memes;
    }

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
