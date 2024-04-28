package br.gov.caixa.app.Models.Services.Saque;

import br.gov.caixa.app.Validador.VerificaSaldo;
import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Models.Contas.ContaCorrente.ContaCorrente;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class SaqueCorrentePF extends VerificaSaldo {
    public static void saqueCorrentePF(ContaCorrente conta, BigDecimal valorSaque){
        BigDecimal saldo = conta.getSaldo();
        LocalDate dataDeSaque = LocalDate.now();
        BigDecimal taxa;
        if (verificaSaldo(valorSaque, saldo)){
            taxa = valorSaque.multiply(Classificacao.CPF.getTaxaSaque());
            BigDecimal valorReal = valorSaque.add(taxa);
            conta.setSaldo(saldo.subtract(valorReal));
            HistoricoAcoes historicoAcoesSaque = new HistoricoAcoes(dataDeSaque,
                    "Saque",
                    valorSaque,
                    valorReal,
                    conta.getCliente(),
                    null
            );
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesSaque);
            System.out.println("Saque realizado com sucesso");
        } else {
            BigDecimal valorReal = BigDecimal.valueOf(0);
            HistoricoAcoes historicoAcoesSaque = new HistoricoAcoes(dataDeSaque,
                    "Saque",
                    valorSaque,
                    valorReal,
                    conta.getCliente(),
                    null
            );
            RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesSaque);
            System.out.println("Não foi possível realizar o saque");
        }

    }
}
