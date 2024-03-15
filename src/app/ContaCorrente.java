/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author Marcio
 */
public class ContaCorrente {
    //Atributos
    private float juros = 0.01f;
    private float saldo;
    private float limiteChequeEspecial = -200f;
    private float saldoTotal = this.saldo + this.limiteChequeEspecial;
    private String primeiroNome;
    private String sobreNome;
    private long numero;
    
    //Get e Set

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

    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(float limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public float getSaldoTotal() {
        return saldoTotal;
    }

    public void setSaldoTotal(float saldoTotal) {
        this.saldoTotal = saldoTotal;
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

    public long getNumero() {
        System.out.println(this.numero);
        return numero;
    }

    public void setNumero(long numero) {    
        this.numero = numero;
    }

    //Metodos Personalizados
    public void deposito(float v) {
        
        this.setSaldoTotal(this.getSaldoTotal() + v);
        if (this.getSaldoTotal() <0 ){
            this.setLimiteChequeEspecial(this.getLimiteChequeEspecial() + v);
        } else {
            this.setSaldo(this.getSaldoTotal() - this.getLimiteChequeEspecial());
        }
        this.setSaldoTotal(this.getSaldoTotal() + this.getSaldo());
        System.out.println("Depósito realizado com sucesso!");
    }
    
    public void saque(float v) {
        
        if(this.getSaldoTotal() <= v){
            System.out.println("Limite insuficiente!");
        } else if (this.getSaldo() <= 0){
            this.setLimiteChequeEspecial(this.getLimiteChequeEspecial() - v);
        } else if(this.getSaldo() > 0 && this.getSaldo() < v){
            this.setSaldoTotal(this.getSaldoTotal() - v);
            this.setLimiteChequeEspecial(v - this.getSaldo());
            this.setSaldo(0);
        
        } else {
            this.setSaldo(this.getSaldo() - v);
            this.setSaldoTotal(this.getSaldoTotal() + this.getSaldo());
            
        }
        
    }  
   
   public void rendimento(){
       if (this.getSaldoTotal() > 0) {
           this.setSaldo(this.getSaldo() * (1 + this.getJuros()));
       } else {
           System.out.println("Saldo negativo!");
       }
   }
    
   public void exibeSaldo(){
       
        System.out.println("Seu saldo total é de R$ " + this.getSaldoTotal() + ", sendo saldo de R$ " + this.getSaldo() + " e R$ " + this.getLimiteChequeEspecial() + "de limite de cheque especial.");
       
   }
   
   public void nomeCompleto(){
       System.out.println("Nome do cliente: " + this.getPrimeiroNome() + " " + this.getSobreNome());
   }
   
   
}