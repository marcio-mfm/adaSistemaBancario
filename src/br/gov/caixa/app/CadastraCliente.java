package br.gov.caixa.app;

public class CadastraCliente {
    private String primeiroNome;
    private String sobreNome;
    private int cpf;
    private  String endereco;

    public CadastraCliente(String primeiroNome, String sobreNome, int cpf, String endereco) {
        this.primeiroNome = primeiroNome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }



    public void nomeCompleto(){
        System.out.println("Nome do cliente: " + this.getPrimeiroNome() + " " + this.getSobreNome());
    }
}
