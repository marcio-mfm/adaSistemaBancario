package br.gov.caixa.app.Models.Services.HistoricoAcoes;

import br.gov.caixa.app.Models.Users.Cliente;

import java.util.ArrayList;
import java.util.Arrays;

public class ImprimeAcoes {
    public static void imprimeAcoes(Cliente cliente){
        ListaAcoes listaAcoes = cliente.getContaCorrente().getListaAcoes();
        String listaString = Arrays.deepToString(listaAcoes.getListaAcoes().toArray());

        for(HistoricoAcoes j : listaAcoes.getListaAcoes())
            System.out.println(j.getData().toString() + " - " + j.getIdentficacao() + " - Valor pretendido: " + j.getValorPretendito() + " - Valor Real: " + j.getValorReal() + " - Cliente origem: " + (j.getUsuarioOrigem() == null ? j.getUsuarioOrigem() : j.getUsuarioOrigem().getNome()) + " - Cliente Destino: " + (j.getUsuarioDestino() == null ? j.getUsuarioDestino() : j.getUsuarioDestino().getNome()));


       /* System.out.println(

                "Movimentações em Conta Corrente:" + listaString + "\n____________\n" + "Movimentações em Conta Poupança: + cliente.getContaPoupanca().getListaAcoes().toString()"
                + "\n______________\n" + "Movimentações em conta investimento: + cliente.getContaInvestimento().getListaAcoes().toString()");*/
    }
}
