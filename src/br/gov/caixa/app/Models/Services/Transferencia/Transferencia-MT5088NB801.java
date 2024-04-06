package br.gov.caixa.app.Models.Services.Transferencia;

import br.gov.caixa.app.Models.Common.Conta;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.HistoricoAcoes;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.RegistraAcoes;
import br.gov.caixa.app.Models.Users.Cliente;
import br.gov.caixa.app.Validador.VerificaSaldo;

import java.util.Date;

public class Transferencia extends VerificaSaldo {
    public void trasnferenciaPF(Conta contaOrigem, Conta contaDestino, float valorTransferencia){
        Cliente clienteOrigem = contaOrigem.getCliente();
        Cliente clienteDestino = contaDestino.getCliente();

        float saldoOrigem = contaOrigem.getSaldo();
        float taxa;
        Date data = new Date();
        if (verificaSaldo(valorTransferencia, saldoOrigem)){
           //Utiliza a taxa conforme a classificação
            taxa = (valorTransferencia * clienteOrigem.getClassificacao().getTaxaSaque());
            float valorReal = (valorTransferencia + taxa);

            //Atualiza saldo de Origem
            contaOrigem.setSaldo(saldoOrigem - valorReal);

            //Atualiza Saldo de Destino
            float saldoDestino = contaDestino.getSaldo();
            contaDestino.setSaldo(saldoDestino + valorTransferencia);

            //Registra Histórico na Conta Origem
            HistoricoAcoes historicoAcoesOrigem = new HistoricoAcoes(data, "Envio de Transferencia", valorTransferencia, valorReal, clienteOrigem, clienteDestino);
            RegistraAcoes.registraAcoes(contaOrigem.getListaAcoes(), historicoAcoesOrigem);

            //Registra Histórico na Conta de Destino
            HistoricoAcoes historicoAcoesDestino = new HistoricoAcoes(data, "Transferência Recebida", valorTransferencia, valorTransferencia, clienteOrigem, clienteDestino);
            RegistraAcoes.registraAcoes(contaDestino.getListaAcoes(), historicoAcoesDestino);

            System.out.println("Transferência realizada com Sucesso");
        } else {
            float valorReal = 0f;
            HistoricoAcoes historicoAcoesFalha = new HistoricoAcoes(data, "Não foi possível efetivar a transferência", valorTransferencia, valorReal, clienteOrigem, clienteDestino);
            RegistraAcoes.registraAcoes(contaOrigem.getListaAcoes(), historicoAcoesFalha);
        }
    }

}
