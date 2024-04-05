package br.gov.caixa.app.Validador;

public abstract class VerificaSaldo {

    public boolean verificaSaldo(float valorDebito , float saldo){

        if (saldo >= valorDebito) {
            return true;
        } else {
            return false;
        }

    }
}
