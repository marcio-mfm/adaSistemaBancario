package br.gov.caixa.app.Models.Services.Investimento;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Contas.ContaInvestimento.AbreContaInvestimento;
import br.gov.caixa.app.Models.Contas.ContaInvestimento.ContaInvestimento;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;
import br.gov.caixa.app.Validador.VerificaSaldo;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class RealizaInvestmento extends VerificaSaldo{
    public static void realizaInvestimento(Conta conta, BigDecimal valorInvestir){
        Cliente clienteInvestimento = conta.getCliente();
        LocalDate data = LocalDate.now();
        BigDecimal saldo = conta.getSaldo();
        if(verificaSaldo(valorInvestir, saldo)) {
            if (clienteInvestimento.isTemContaInvestimento()) {
                ContaInvestimento contaInvestimento = clienteInvestimento.getContaInvestimento();
                contaInvestimento.setSaldo(contaInvestimento.getSaldo().add(valorInvestir));
                contaInvestimento.setDataInvestmento(data);

            } else {
               ContaInvestimento contaInvestimento = AbreContaInvestimento.criaContaInvestimento(data, Status.Ativo, clienteInvestimento, clienteInvestimento.getId());
               contaInvestimento.setSaldo(contaInvestimento.getSaldo().add(valorInvestir));
               contaInvestimento.setDataInvestmento(data);
            }
            //Registra Investimento
            HistoricoAcoes historicoAcoesInvestimento = new HistoricoAcoes(data, "Valor Investido", valorInvestir, valorInvestir, null, null);
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesInvestimento);

        } else {
            HistoricoAcoes historicoAcoesInvestimento = new HistoricoAcoes(data, "Não foi possível realizar Investimento", valorInvestir, BigDecimal.valueOf(0), null, null);
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesInvestimento);

        }

    }
}
