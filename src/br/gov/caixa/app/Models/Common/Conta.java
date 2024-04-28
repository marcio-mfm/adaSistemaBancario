package br.gov.caixa.app.Models.Common;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public abstract class Conta {
    //Atributos
    private String id;
    private BigDecimal saldo;
    private ListaAcoes listaAcoes;
    private LocalDate dataDeAtualizacao;
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

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public ListaAcoes getListaAcoes() {
        return listaAcoes;
    }


    public LocalDate getDataDeAtualizacao() {
        return dataDeAtualizacao;
    }

    public void setDataDeAtualizacao(LocalDate dataDeAtualizacao) {
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

    public Conta(String id, BigDecimal saldo, ListaAcoes listaAcoes, LocalDate dataDeAtualizacao, Status status, Cliente cliente) {
        this.id = id;
        this.saldo = saldo;
        this.listaAcoes = listaAcoes;
        this.dataDeAtualizacao = dataDeAtualizacao;
        this.status = status;
        this.cliente = cliente;
    }
}
