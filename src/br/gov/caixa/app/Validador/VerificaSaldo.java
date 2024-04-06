package br.gov.caixa.app.Validador;

public abstract class VerificaSaldo {

    public static boolean verificaSaldo(float valorDebito, float saldo){

        if (saldo >= valorDebito) {
            return true;
        } else {
            return false;
        }

    }
}
