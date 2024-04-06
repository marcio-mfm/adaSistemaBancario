package br.gov.caixa.app.Models.Contas.ContaInvestimento;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public class ContaInvestimento extends Conta {

    private Date dataInvestmento;

    public Date getDataInvestmento() {
        return dataInvestmento;
    }

    public void setDataInvestmento(Date dataInvestmento) {
        this.dataInvestmento = dataInvestmento;
    }

    public ContaInvestimento(String id, float saldo, ListaAcoes listaAcoes, Date dataDeAtualizacao, Status status, Cliente cliente, String IdUsuario) {
        super(id, saldo, listaAcoes, dataDeAtualizacao, status, cliente);
    }
}
