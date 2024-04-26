package br.gov.caixa.app.Models.Users;

import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Contas.ContaCorrente.AbreContaCorrente;
import br.gov.caixa.app.Models.Contas.ContaCorrente.ContaCorrente;

import java.util.Date;

public class CadastraCliente {
    public static Cliente cadastraClientePF(String id, Classificacao classificacao, String nome, Date dataDeCadastro, Status status){
        dataDeCadastro = new Date();
        classificacao = Classificacao.CPF;
        status = Status.Ativo;
        String IdUsuario = id;
        Cliente clientePF = new Cliente(id, classificacao, nome, dataDeCadastro, status);
        ContaCorrente contaCorrente = AbreContaCorrente.criaContaCorrente(dataDeCadastro, status,clientePF, IdUsuario);
        return clientePF;
    }
}
