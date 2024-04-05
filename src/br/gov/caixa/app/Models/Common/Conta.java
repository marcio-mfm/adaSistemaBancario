package br.gov.caixa.app.Models.Common;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public abstract class Conta {
    //Atributos
    private String id;
    private float saldo;
    private ListaAcoes listaAcoes;
    private Date dataDeAtualizacao;
    private Status status;
    private Cliente cliente;
    private String IdUsuario;

    //Getters & Setters


    public Cliente getCliente() {
        return cliente;
    }

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

    public ListaAcoes getListaAcoes() {
        return listaAcoes;
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

    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    //Ações

    public Conta(String id, float saldo, ListaAcoes listaAcoes, Date dataDeAtualizacao, Status status, Cliente cliente, String IdUsuario) {
        this.id = id;
        this.saldo = saldo;
        this.listaAcoes = listaAcoes;
        this.dataDeAtualizacao = dataDeAtualizacao;
        this.status = status;
        this.cliente = cliente;
        this.IdUsuario = IdUsuario;
    }
}
