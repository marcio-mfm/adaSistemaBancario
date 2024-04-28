package br.gov.caixa.app.Models.Contas.ContaInvestimento;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class ContaInvestimento extends Conta {

    private LocalDate dataInvestmento;

    public LocalDate getDataInvestmento() {
        return dataInvestmento;
    }

    public void setDataInvestmento(LocalDate dataInvestmento) {
        this.dataInvestmento = dataInvestmento;
    }

    public ContaInvestimento(String id, BigDecimal saldo, ListaAcoes listaAcoes, LocalDate dataDeAtualizacao, Status status, Cliente cliente, String IdUsuario) {
        super(id, saldo, listaAcoes, dataDeAtualizacao, status, cliente);
    }
}
