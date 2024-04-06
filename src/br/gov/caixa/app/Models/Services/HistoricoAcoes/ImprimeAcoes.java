package br.gov.caixa.app.Models.Services.HistoricoAcoes;

import br.gov.caixa.app.Models.Users.Cliente;

public class ImprimeAcoes {
    public static void imprimeAcoes(Cliente cliente){
        System.out.println("Movimentações em Conta Corrente:" + cliente.getContaCorrente().getListaAcoes().toString() + "\n____________\n" + "Movimentações em Conta Poupança:" + cliente.getContaPopanca().getListaAcoes().toString()
                + "\n______________\n" + "Movimentações em conta investimento:" + cliente.getContaInvestimento().getListaAcoes().toString());
    }
}
