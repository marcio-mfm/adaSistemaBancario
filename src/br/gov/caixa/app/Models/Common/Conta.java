package br.gov.caixa.app.Models.Common;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public abstract class Conta {
    //Atributos
    private String id;
    private float saldo;
    private String historicoAcoes;
    private Date dataDeAtualizacao;
    private Status status;
    private Cliente usuario;

    //Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getHistoricoAcoes() {
        return historicoAcoes;
    }

    public void setHistoricoAcoes(String historicoAcoes) {
        this.historicoAcoes = historicoAcoes;
    }

    public Date getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public void setDataDeAtualizacao(Date dataDeAtualizacao) {
        this.dataDeAtualizacao = dataDeAtualizacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Cliente getUsuario() {
        return usuario;
    }

    public void setUsuario(Cliente usuario) {
        this.usuario = usuario;
    }

    //Ações

    public Conta(String id, float saldo, String historicoAcoes, Date dataDeAtualizacao, Status status, Cliente usuario) {
        this.id = id;
        this.saldo = saldo;
        this.historicoAcoes = historicoAcoes;
        this.dataDeAtualizacao = dataDeAtualizacao;
        this.status = status;
        this.usuario = usuario;
    }
}
