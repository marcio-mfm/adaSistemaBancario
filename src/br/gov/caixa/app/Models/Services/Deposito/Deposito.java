package br.gov.caixa.app.Models.Services.Deposito;

import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;

import java.util.Date;

public class Deposito {
    public static void deposito(Conta conta,float valorDeposito){
        float saldoAtual = conta.getSaldo();
        conta.setSaldo(valorDeposito + saldoAtual);
        Date dataDeposito = new Date();
        HistoricoAcoes historicoAcoesDeposito = new HistoricoAcoes(dataDeposito, "Deposito", valorDeposito, valorDeposito, null, null);
        RegistraAcoes.registraAcoes(conta.getListaAcoes(), historicoAcoesDeposito);
    }
}
