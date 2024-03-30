package br.gov.caixa.app.Models.Services;

import br.gov.caixa.app.Enum.Classificacao;

public class SaqueCorrentePJ extends Saque{
    double taxa;
    public double saqueCorrentePJ(String id, double valorSaque, double saldo){

        if (saque(id, valorSaque, saldo)){
            taxa = valorSaque * Classificacao.CNPJ.getTaxaSaque();
            return  saldo - valorSaque - taxa;
        } else {
            return saldo;
        }
    }
}
