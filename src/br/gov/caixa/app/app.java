/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.gov.caixa.app;

import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Services.Deposito.Deposito;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ImprimeAcoes;
import br.gov.caixa.app.Models.Services.Investimento.RealizaInvestmento;
import br.gov.caixa.app.Models.Services.Saque.SaqueCorrentePF;
import br.gov.caixa.app.Models.Users.CadastraCliente;
import br.gov.caixa.app.Models.Users.Cliente;

import java.util.Date;

/**
 *
 * @author Marcio
 */
public class app {

    public static void main(String[] args) {
        Date data = new Date();
        Cliente clientePF = new Cliente("11111111111", Classificacao.CPF, "Fulano de Tal", data, Status.Ativo);
        CadastraCliente.cadastraClientePF("11111111111", Classificacao.CPF, "Fulano de Tal", data, Status.Ativo);

        Deposito.deposito(clientePF.getContaCorrente(), 250.00f);
        SaqueCorrentePF.saqueCorrentePF(clientePF.getContaCorrente(), 50f);
        RealizaInvestmento.realizaInvestimento(clientePF.getContaCorrente(), 50f);

        ImprimeAcoes.imprimeAcoes(clientePF);

    }
    
}
