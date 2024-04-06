package br.gov.caixa.app.Models.Contas.ContaPoupanca;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Interfaces.CriaContaPoupanca;
import br.gov.caixa.app.Models.Contas.ContaCorrente.ContaCorrente;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

public abstract class AbreContaPoupanca implements CriaContaPoupanca {

        public static ContaCorrente criaContaPoupanca(Date dataDeAtualizacao, Status status, Cliente cliente, String IdUsuario) {
            int geraId = (int) Math.random();
            String id = Integer.toString(geraId);
            float saldo = 0;
            HistoricoAcoes historicoAcoes = new HistoricoAcoes(dataDeAtualizacao, "Abertura da conta", 0, 0, null, null);
            ListaAcoes listaAcoesContaCorrente = new ListaAcoes();
            RegistraAcoes.registraAcoes(listaAcoesContaCorrente, historicoAcoes);
            return new ContaCorrente(id, saldo, listaAcoesContaCorrente, dataDeAtualizacao, status, cliente, IdUsuario);
        }

}
