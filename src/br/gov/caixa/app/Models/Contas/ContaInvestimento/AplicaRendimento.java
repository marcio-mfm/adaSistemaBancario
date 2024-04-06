package br.gov.caixa.app.Models.Contas.ContaInvestimento;

import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.time.DayOfWeek;
import java.util.Date;

public class AplicaRendimento {
    public void aplicaRendimento(Cliente clienteInvestimento){
        ContaInvestimento conta = clienteInvestimento.getContaInvestimento();
        float saldo = conta.getSaldo();
        float taxaRendimento = clienteInvestimento.getClassificacao().getTaxaInvestimento();
        float valorRendiemnto = saldo * taxaRendimento;
        Date data = new Date();
        int diasDoInvestimento = conta.getDataInvestmento().compareTo(data);
        if(diasDoInvestimento > 30) {
            float rendimentoTotal = valorRendiemnto * diasDoInvestimento/30;
            conta.setSaldo(saldo + rendimentoTotal);
            HistoricoAcoes historicoAcoesRendimento = new HistoricoAcoes(data, "Rendimento aplicados nesta data", rendimentoTotal, rendimentoTotal, null, null);
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesRendimento);
        } else {
            HistoricoAcoes historicoAcoesRendimento = new HistoricoAcoes(data, "Não há rendimentos a serem aplicados", 0f, 0f, null, null);
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesRendimento);

        }

    }
}
