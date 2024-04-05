package br.gov.caixa.app.Models.Users;

import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Enum.Status;

import java.util.Date;

public class Cliente {
    //Variáveis
    private String id;
    private Classificacao classificacao;
    private String nome;
    private Date dataDeCadastro;
    private Status status;

    //Gtters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //Construtor


    public Cliente(String id, Classificacao classificacao, String nome, Date dataDeCadastro, Status status) {
        this.id = id;
        this.classificacao = classificacao;
        this.nome = nome;
        this.dataDeCadastro = dataDeCadastro;
        this.status = status;
    }
}
