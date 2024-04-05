package br.gov.caixa.app.Models.Services.Saque;

import br.gov.caixa.app.Validador.VerificaSaldo;
import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Models.Contas.ContaCorrente.ContaCorrente;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;

import java.util.Date;

public class SaqueCorrentePJ extends VerificaSaldo {
    float taxa;
    public void saqueCorrentePJ(ContaCorrente conta, float valorSaque, float saldo){
        saldo = conta.getSaldo();
        Date dataDeSaque = new Date();
        if (verificaSaldo(valorSaque, saldo)){
            taxa = (float) (valorSaque * Classificacao.CNPJ.getTaxaSaque());
            float valorReal = (valorSaque + taxa);
            conta.setSaldo((saldo - valorReal));
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
            float valorReal = 0;
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
