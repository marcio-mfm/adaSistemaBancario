package br.gov.caixa.app.Models.Contas.ContaCorrente;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Interfaces.CriaContaCorrente;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public abstract class AbreContaCorrente implements CriaContaCorrente {



    public static ContaCorrente criaContaCorrente(LocalDate dataDeAtualizacao, Status status, Cliente cliente, String IdUsuario) {
        Random random = new Random();
        int geraId =  random.nextInt(9999);
        String id = Integer.toString(geraId);
        BigDecimal saldo = BigDecimal.valueOf(0);
       HistoricoAcoes historicoAcoes = new HistoricoAcoes(dataDeAtualizacao, "Abertura da conta", BigDecimal.valueOf(0), BigDecimal.valueOf(0), null, null);
       ListaAcoes listaAcoesContaCorrente = new ListaAcoes();
        RegistraAcoes.registraAcoes(listaAcoesContaCorrente, historicoAcoes);
        ContaCorrente contaCorrente = new ContaCorrente(id, saldo, listaAcoesContaCorrente, dataDeAtualizacao, status, cliente, IdUsuario);
        cliente.setContaCorrente(contaCorrente);
        return contaCorrente;
    }
}
