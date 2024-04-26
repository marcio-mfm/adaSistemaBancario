package br.gov.caixa.app.Models.Services.HistoricoAcoes;

import br.gov.caixa.app.Models.Users.Cliente;

import java.math.BigDecimal;
import java.util.Date;

public class HistoricoAcoes {
    private Date data;
    private String identficacao;
    private BigDecimal valorPretendito;
    private BigDecimal valorReal;
    private Cliente usuarioOrigem;
    private Cliente usuarioDestino;

    public HistoricoAcoes(Date data, String identficacao, BigDecimal valorPretendito, BigDecimal valorReal, Cliente usuarioOrigem, Cliente usuarioDestino) {
        this.data = data;
        this.identficacao = identficacao;
        this.valorPretendito = valorPretendito;
        this.valorReal = valorReal;
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
    }

    public Date getData() {
        return data;
    }

    public String getIdentficacao() {
        return identficacao;
    }

    public BigDecimal getValorPretendito() {
        return valorPretendito;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public Cliente getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public Cliente getUsuarioDestino() {
        return usuarioDestino;
    }
}
