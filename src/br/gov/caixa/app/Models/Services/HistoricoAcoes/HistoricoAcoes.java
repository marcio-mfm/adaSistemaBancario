package br.gov.caixa.app.Models.Services.HistoricoAcoes;

import br.gov.caixa.app.Models.Users.Cliente;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoricoAcoes {
    private Date data;
    private String identficacao;
    private double valorPretendito;
    private double valorReal;
    private Cliente usuarioOrigem;
    private Cliente usuarioDestino;

    public HistoricoAcoes(Date data, String identficacao, double valorPretendito, double valorReal, Cliente usuarioOrigem, Cliente usuarioDestino) {
        this.data = data;
        this.identficacao = identficacao;
        this.valorPretendito = valorPretendito;
        this.valorReal = valorReal;
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
    }


}
