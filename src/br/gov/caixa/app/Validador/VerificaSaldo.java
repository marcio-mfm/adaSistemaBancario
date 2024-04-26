package br.gov.caixa.app.Validador;

import java.math.BigDecimal;

public abstract class VerificaSaldo {

    public static boolean verificaSaldo(BigDecimal valorDebito, BigDecimal saldo){

        if (saldo.compareTo(valorDebito) == 0 || saldo.compareTo(valorDebito) == 1) {
            return true;
        } else {
            return false;
        }

    }
}
