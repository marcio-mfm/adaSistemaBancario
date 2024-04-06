package br.gov.caixa.app.Models.Contas.ContaInvestimento;

import br.gov.caixa.app.Enum.Status;


import br.gov.caixa.app.Interfaces.CriaContaInvestimento;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public abstract class AbreContaInvestimento implements CriaContaInvestimento {

        public static ContaInvestimento criaContaInvestimento(Date dataDeAtualizacao, Status status, Cliente cliente, String IdUsuario) {
        int geraId = (int) Math.random();
        String id = Integer.toString(geraId);
        float saldo = 0;
        HistoricoAcoes historicoAcoes = new HistoricoAcoes(dataDeAtualizacao, "Abertura da conta Investimento", 0, 0, null, null);
        ListaAcoes listaAcoesContaInvestimento = new ListaAcoes();
        RegistraAcoes.registraAcoes(listaAcoesContaInvestimento, historicoAcoes);
        return new ContaInvestimento(id, saldo, listaAcoesContaInvestimento, dataDeAtualizacao, status, cliente, IdUsuario);

    }
}
