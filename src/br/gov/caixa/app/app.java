/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.gov.caixa.app;

import br.gov.caixa.app.Enum.Classificacao;
import br.gov.caixa.app.Enum.Status;
import br.gov.caixa.app.Models.Services.Deposito.Deposito;
import br.gov.caixa.app.Models.Users.CadastraCliente;
import br.gov.caixa.app.Models.Users.ListaCliente;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Marcio
 */
public class app {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        List<String> clientesCadastrados = new ArrayList<>();
        clientesCadastrados.add("Nome; CPF/CNPJ; PF/PJ; Num_Conta; Saldo");

//        Cliente clientePF = CadastraCliente.cadastraClientePF("11111111111", Classificacao.CPF, "Fulano de Tal", data, Status.Ativo);
//
//        Deposito.deposito(clientePF.getContaCorrente(), BigDecimal.valueOf(250.00));
//        SaqueCorrentePF.saqueCorrentePF(clientePF.getContaCorrente(), BigDecimal.valueOf(50));
//        RealizaInvestmento.realizaInvestimento(clientePF.getContaCorrente(), BigDecimal.valueOf(50f));
//        AbreContaPoupanca.criaContaPoupanca(data, Status.Ativo, clientePF);
//
//        ImprimeAcoes.imprimeAcoes(clientePF);


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Path path = Path.of("C:/Users/c139450/Ada/adaSistemaBancario/src/br/gov/caixa/app/Arquivos/pessoas.csv");
        Stream<String> listaClientes = null;
        try{
            listaClientes = Files.lines(path);

        }catch (IOException e) {
            System.out.println("Não foi possível ler arquivo");
        }


        //Deposito.deposito(cliente.getContaCorrente(), BigDecimal.valueOf(50)),
        assert listaClientes != null;
        listaClientes
                .skip(1)
                .map(linha -> {
                    String[] colunas = linha.split(",");
                    //Arrays.stream(colunas).filter(coluna -> "1".equals(colunas[3]));
                            return new ListaCliente(colunas[0], colunas[1], colunas[2], colunas[3]);
                    //return new ListaCliente(colunas[0], colunas[1], colunas[2], colunas[3]);
                })
                .filter(listaCliente -> "2".equals(listaCliente.tipo()))
                .filter(linha -> Period.between(LocalDate.parse(linha.nascimentoCriacao(), formatter), dataAtual).getYears() >= 18)
                .map(listaCliente -> {
                    return CadastraCliente.cadastraCliente(listaCliente.CPFCNPJ(), Classificacao.CPF, listaCliente.nome(), dataAtual, Status.Ativo);

                })
                .map(cliente -> {
                    Deposito.deposito(cliente.getContaCorrente(), BigDecimal.valueOf(50));
                    return (cliente.getNome() + ";" + cliente.getId() + ";PF;" + cliente.getContaCorrente().getId() + ";" + cliente.getContaCorrente().getSaldo());
                })
                .forEach(clientesCadastrados::add
                );

        Path pathPJ = Path.of("C:/Users/c139450/Ada/adaSistemaBancario/src/br/gov/caixa/app/Arquivos/pessoas.csv");
        Stream<String> listaClientesPJ = null;
        try{
            listaClientesPJ = Files.lines(path);

        }catch (IOException e) {
            System.out.println("Não foi possível ler arquivo");
        }
        listaClientesPJ
                .skip(1)
                .map(linha -> {
                    String[] colunas = linha.split(",");
                    //Arrays.stream(colunas).filter(coluna -> "1".equals(colunas[3]));
                    return new ListaCliente(colunas[0], colunas[1], colunas[2], colunas[3]);
                    //return new ListaCliente(colunas[0], colunas[1], colunas[2], colunas[3]);
                })
                .filter(listaClientePJ -> "1".equals(listaClientePJ.tipo()))
                .map(listaCliente -> {
                    return CadastraCliente.cadastraCliente(listaCliente.CPFCNPJ(), Classificacao.CNPJ, listaCliente.nome(), dataAtual, Status.Ativo);

                })
                .map(cliente -> {
                    Deposito.deposito(cliente.getContaCorrente(), BigDecimal.valueOf(50));
                    return (cliente.getNome() + ";" + cliente.getId() + ";PJ;" + cliente.getContaCorrente().getId() + ";" + cliente.getContaCorrente().getSaldo());
                })
                .forEach(clientesCadastrados::add
                );


        try {
            Path destino = Path.of("C:/Users/c139450/Ada/adaSistemaBancario/src/br/gov/caixa/app/Output/clientesCadastrados.csv");

            Files.write(destino, clientesCadastrados);
            //Files.write(destino, clientesCadastrados);
        } catch (IOException e) {
            System.out.println("Não foi possível ler arquivo");
        }

    }
    
}
