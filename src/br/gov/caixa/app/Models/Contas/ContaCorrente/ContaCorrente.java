
package br.gov.caixa.app.Models.Contas.ContaCorrente;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ListaAcoes;
import br.gov.caixa.app.Models.Users.Cliente;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;


public class ContaCorrente extends Conta {

    public ContaCorrente(String id, BigDecimal saldo, ListaAcoes listaAcoes, LocalDate dataDeAtualizacao, Status status , Cliente cliente, String IdUsuario) {
        super(id, saldo, listaAcoes, dataDeAtualizacao, status, cliente);
    }
}
