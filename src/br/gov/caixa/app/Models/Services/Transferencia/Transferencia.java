package br.gov.caixa.app.Models.Services.Transferencia;

import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;
import br.gov.caixa.app.Validador.VerificaSaldo;

import java.math.BigDecimal;
import java.util.Date;

public class Transferencia extends VerificaSaldo {
    public void trasnferenciaPF(Conta contaOrigem, Conta contaDestino, BigDecimal valorTransferencia){
        Cliente clienteOrigem = contaOrigem.getCliente();
        Cliente clienteDestino = contaDestino.getCliente();

        BigDecimal saldoOrigem = contaOrigem.getSaldo();
        BigDecimal taxa;
        Date data = new Date();
        if (verificaSaldo(valorTransferencia, saldoOrigem)){
           //Utiliza a taxa conforme a classificação
            taxa = (valorTransferencia.multiply(clienteOrigem.getClassificacao().getTaxaSaque()));
            BigDecimal valorReal = (valorTransferencia.add(taxa));

            //Atualiza saldo de Origem
            contaOrigem.setSaldo(saldoOrigem.subtract(valorReal));

            //Atualiza Saldo de Destino
            BigDecimal saldoDestino = contaDestino.getSaldo();
            contaDestino.setSaldo(saldoDestino.add(valorTransferencia));

            //Registra Histórico na Conta Origem
            HistoricoAcoes historicoAcoesOrigem = new HistoricoAcoes(data, "Envio de Transferencia", valorTransferencia, valorReal, clienteOrigem, clienteDestino);
            RegistraAcoes.registraAcoes(contaOrigem.getListaAcoes(), historicoAcoesOrigem);

            //Registra Histórico na Conta de Destino
            HistoricoAcoes historicoAcoesDestino = new HistoricoAcoes(data, "Transferência Recebida", valorTransferencia, valorTransferencia, clienteOrigem, clienteDestino);
            RegistraAcoes.registraAcoes(contaDestino.getListaAcoes(), historicoAcoesDestino);

            System.out.println("Transferência realizada com Sucesso");
        } else {
            BigDecimal valorReal = BigDecimal.valueOf(0);
            HistoricoAcoes historicoAcoesFalha = new HistoricoAcoes(data, "Não foi possível efetivar a transferência", valorTransferencia, valorReal, clienteOrigem, clienteDestino);
            RegistraAcoes.registraAcoes(contaOrigem.getListaAcoes(), historicoAcoesFalha);
        }
    }

}
