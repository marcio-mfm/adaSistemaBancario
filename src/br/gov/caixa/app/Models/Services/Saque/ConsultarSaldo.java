package br.gov.caixa.app.Models.Services.Saque;

import br.gov.caixa.app.Models.Common.Conta;

import java.math.BigDecimal;

public class ConsultarSaldo {
    public static BigDecimal consultaSaldo(Conta conta){

        return conta.getSaldo();
    }
}
