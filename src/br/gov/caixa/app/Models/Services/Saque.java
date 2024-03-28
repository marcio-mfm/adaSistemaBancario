package br.gov.caixa.app.Models.Services;

public abstract class Saque {
    double saldoDisponivel;
    double valorDoSaque;
    public boolean saque(String id, Double valorSaque ,Double saldo){

        if (saldo >= valorSaque) {
            return true;
        } else {
            return false;
        }

    }
}
