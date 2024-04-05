package br.gov.caixa.app.Models.Services.HistoricoAcoes;

public class RegistraAcoes {

    public static void registraAcoes(ListaAcoes listaAcoes, HistoricoAcoes historicoAcoes){
       listaAcoes.getListaAcoes().add(historicoAcoes);


    }
}
