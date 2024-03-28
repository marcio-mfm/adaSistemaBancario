package br.gov.caixa.app.Models.Services;

public class SaqueCorrentePJ extends Saque{
    double taxa;
    public double saqueCorrentePF(String id, double valorSaque, double saldo){
        if (saque(id, valorSaque, saldo)){
            taxa = valorSaque * 0.005;
            return saldo - valorSaque - taxa;
        } else {
            return saldo;
        }
    }
}
