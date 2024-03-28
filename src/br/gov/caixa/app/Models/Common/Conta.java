package br.gov.caixa.app.Models.Common;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public abstract class Conta {
    //Atributos
    private Long id;
    private float saldo;
    private String historicoAcoes;
    private Date dataDeAtualizacao;
    private Status status;
    private Cliente usuario;

    //Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

}
