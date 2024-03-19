package br.com.thiago.microusuarioAppMeme.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Meme {
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

    @ManyToOne
    @JoinColumn(name = "categoria_meme_id")
    private CategoriaMeme categoriaMeme;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    public Meme(){}

    public Meme(Long id, String nome, String descricao, Date dataCadastro, CategoriaMeme categoriaMeme, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.categoriaMeme = categoriaMeme;
        this.usuario = usuario;
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

    public CategoriaMeme getCategoriaMeme() {
        return categoriaMeme;
    }

    public void setCategoriaMeme(CategoriaMeme categoriaMeme) {
        this.categoriaMeme = categoriaMeme;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
