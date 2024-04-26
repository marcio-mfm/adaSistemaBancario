/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.gov.caixa.app;

import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Contas.ContaPoupanca.AbreContaPoupanca;
import br.gov.caixa.app.Models.Services.Deposito.Deposito;
import br.gov.caixa.app.Models.Services.HistoricoAcoes.ImprimeAcoes;
import br.gov.caixa.app.Models.Services.Investimento.RealizaInvestmento;
import br.gov.caixa.app.Models.Services.Saque.SaqueCorrentePF;
import br.gov.caixa.app.Models.Users.CadastraCliente;
import br.gov.caixa.app.Models.Users.Cliente;
import br.gov.caixa.app.Models.Users.ListaCliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Marcio
 */
public class app {

    public static void main(String[] args) {
        Date data = new Date();
//        Cliente clientePF = CadastraCliente.cadastraClientePF("11111111111", Classificacao.CPF, "Fulano de Tal", data, Status.Ativo);
//
//        Deposito.deposito(clientePF.getContaCorrente(), BigDecimal.valueOf(250.00));
//        SaqueCorrentePF.saqueCorrentePF(clientePF.getContaCorrente(), BigDecimal.valueOf(50));
//        RealizaInvestmento.realizaInvestimento(clientePF.getContaCorrente(), BigDecimal.valueOf(50f));
//        AbreContaPoupanca.criaContaPoupanca(data, Status.Ativo, clientePF);
//
//        ImprimeAcoes.imprimeAcoes(clientePF);

        Path path = Path.of("C://Users//c139450//Ada//adaSistemaBancario//src//br//gov//caixa//app//Arquivos//pessoas.csv");
        Stream<String> listaClientes = null;
        try{
            listaClientes = Files.lines(path);

        }catch (IOException e) {
            System.out.println("Não foi possível ler arquivo");
        }


        listaClientes
                .skip(1)
                .map(linha -> {
                    String[] colunas = linha.split(",");
                    //Arrays.stream(colunas).filter(coluna -> "1".equals(colunas[3]));
                            return new ListaCliente(colunas[0], colunas[1], colunas[2], colunas[3]);
                    //return new ListaCliente(colunas[0], colunas[1], colunas[2], colunas[3]);
                })
                .filter(listaCliente -> "1".equals(listaCliente.tipo()))

                .forEach(linhas ->

                        System.out.println(linhas));
                //.filter(ListaCliente.)
       //System.out.println(listaClientes);
    }
    
}
