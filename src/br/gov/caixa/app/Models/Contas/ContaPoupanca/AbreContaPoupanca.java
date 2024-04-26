package br.gov.caixa.app.Models.Contas.ContaPoupanca;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Interfaces.CriaContaPoupanca;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.math.BigDecimal;
import java.util.Date;

public abstract class AbreContaPoupanca implements CriaContaPoupanca {

        public static ContaPoupanca criaContaPoupanca(Date dataDeAtualizacao, Status status, Cliente cliente) {
            int geraId = (int) Math.random();
            String id = Integer.toString(geraId);
            BigDecimal saldo = BigDecimal.valueOf(0);
            HistoricoAcoes historicoAcoes = new HistoricoAcoes(dataDeAtualizacao, "Abertura da conta Poupança", BigDecimal.valueOf(0), BigDecimal.valueOf(0), null, null);
            ListaAcoes listaAcoesContaPoupanca = new ListaAcoes();
            RegistraAcoes.registraAcoes(listaAcoesContaPoupanca, historicoAcoes);
            return new ContaPoupanca(id, saldo, listaAcoesContaPoupanca, dataDeAtualizacao, status, cliente);
        }

}
