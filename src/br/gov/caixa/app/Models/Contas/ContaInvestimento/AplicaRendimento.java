package br.gov.caixa.app.Models.Contas.ContaInvestimento;

import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class AplicaRendimento {
    public void aplicaRendimento(Cliente clienteInvestimento){
        ContaInvestimento conta = clienteInvestimento.getContaInvestimento();
        BigDecimal saldo = conta.getSaldo();
        BigDecimal taxaRendimento = (clienteInvestimento.getClassificacao().getTaxaInvestimento());
        BigDecimal valorRendiemnto = saldo.multiply(taxaRendimento);
        LocalDate data = LocalDate.now();
        int diasDoInvestimento = conta.getDataInvestmento().compareTo(data);
        if(diasDoInvestimento > 30) {
            BigDecimal rendimentoTotal = valorRendiemnto.multiply(BigDecimal.valueOf(diasDoInvestimento/30));
            conta.setSaldo(saldo.add(rendimentoTotal));
            HistoricoAcoes historicoAcoesRendimento = new HistoricoAcoes(data, "Rendimento aplicados nesta data", rendimentoTotal, rendimentoTotal, null, null);
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesRendimento);
        } else {
            HistoricoAcoes historicoAcoesRendimento = new HistoricoAcoes(data, "Não há rendimentos a serem aplicados", null, null, null, null);
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesRendimento);

        }

    }
}
