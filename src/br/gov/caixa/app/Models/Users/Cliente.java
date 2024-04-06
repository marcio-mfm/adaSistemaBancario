package br.gov.caixa.app.Models.Users;

import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Contas.ContaCorrente.ContaCorrente;
import br.gov.caixa.app.Models.Contas.ContaInvestimento.ContaInvestimento;
import br.gov.caixa.app.Models.Contas.ContaPoupanca.ContaPopanca;

import java.util.Date;

public class Cliente {
    //Variáveis
    private String id;
    private Classificacao classificacao;
    private String nome;
    private Date dataDeCadastro;
    private ContaInvestimento contaInvestimento;
    private boolean TemContaInvestimento = false;
    private Status status;
    private ContaCorrente contaCorrente;
    private ContaPopanca contaPopanca;

    //Gtters & Setters


    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaPopanca getContaPopanca() {
        return contaPopanca;
    }

    public void setContaPopanca(ContaPopanca contaPopanca) {
        this.contaPopanca = contaPopanca;
    }

    public ContaInvestimento getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(ContaInvestimento contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }

    public boolean isTemContaInvestimento() {
        return TemContaInvestimento;
    }

    public void setTemContaInvestimento(boolean temContaInvestimento) {
        TemContaInvestimento = temContaInvestimento;
    }



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
