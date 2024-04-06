package br.gov.caixa.app.Models.Services.Saque;

import br.gov.caixa.app.Models.Common.Conta;

public class ConsultarSaldo {
    public static float consultaSaldo(Conta conta){

        return conta.getSaldo();
    }
}
