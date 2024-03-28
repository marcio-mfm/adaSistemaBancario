package br.gov.caixa.app.Models.Services;

public class SaqueCorrentePF extends Saque{
    public double saqueCorrentePF(String id, double valorSaque, double saldo){
        if (saque(id, valorSaque, saldo)){
            return saldo - valorSaque;
        } else {
            return saldo;
        }
    }

}
