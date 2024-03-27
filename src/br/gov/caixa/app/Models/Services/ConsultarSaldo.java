package br.gov.caixa.app.Models.Services;

import br.gov.caixa.app.Models.Common.Conta;

public class ConsultarSaldo {
    public static Double consultaSaldo(Conta conta){
        return (double) conta.getSaldo();
    }
}
