package br.gov.caixa.app.Models.Services.HistoricoAcoes;

import java.util.ArrayList;

public class ListaAcoes {
    static ArrayList<HistoricoAcoes> listaAcoes = new ArrayList<>();

    public static ArrayList<HistoricoAcoes> getListaAcoes() {
        return listaAcoes;
    }

    public static void setListaAcoes(ArrayList<HistoricoAcoes> listaAcoes) {
        ListaAcoes.listaAcoes = listaAcoes;
    }
}
