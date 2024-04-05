package br.gov.caixa.app.Interfaces;

import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Contas.ContaCorrente.ContaCorrente;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;

import java.util.Date;

public interface CriaContaCorrente {
    public ContaCorrente criaContaCorrente(String id, float saldo, HistoricoAcoes historicoAcoes, Date dataDeAtualizacao, Status status, String IdUsuario);
}
