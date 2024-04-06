package br.gov.caixa.app.Models.Contas.ContaPoupanca;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public class ContaPopanca extends Conta {

    public ContaPopanca(String id, float saldo, ListaAcoes listaAcoes, Date dataDeAtualizacao, Status status, Cliente cliente) {
        super(id, saldo, listaAcoes, dataDeAtualizacao, status, cliente);
    }
}
