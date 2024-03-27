package br.gov.caixa.app.Models.Users;

import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Enum.Status;

import java.util.Date;

public class Usuario {
    //Variáveis
    private String id;
    private Classificacao clasificacao;
    private String nome;
    private Date dataDeCadastro;
    private boolean status;

    //Gtters & Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Classificacao getClasificacao() {
        return clasificacao;
    }

    public void setClasificacao(Classificacao clasificacao) {
        this.clasificacao = clasificacao;
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

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Abre Conta
    public void abreContaCorrente(){

    }
}
