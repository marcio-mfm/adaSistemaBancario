package app;

import java.util.Random;
import java.util.Scanner;

public class ContaPopanca {
private float juros = 0.01f;
private float saldo;

private int numero;

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void abrirContaPoupanca() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro nome do cliente:");
        String primeiroNome = sc.nextLine();
        System.out.println("Digite o sobrenome do cliente:");
        String sobrenome = sc.nextLine();
        System.out.println("Digite o CPF do cliente:");
        int cpf = sc.nextInt();
        System.out.println("Digite o endereço do cliente:");
        String endereco = sc.nextLine();
        CadastraCliente novoCliente = new CadastraCliente(primeiroNome, sobrenome, cpf, endereco);
        Random random = new Random();
        int numero = random.nextInt();
        this.setNumero(numero);
    }

}
