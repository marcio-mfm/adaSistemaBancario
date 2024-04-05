package br.gov.caixa.app.Models.Contas;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public class ContaInvestimento extends Conta {

    public ContaInvestimento(String id, float saldo, HistoricoAcoes historicoAcoes, Date dataDeAtualizacao, Status status, Cliente cliente, String IdUsuario) {
        super(id, saldo, historicoAcoes, dataDeAtualizacao, status, cliente, IdUsuario);
    }
}
