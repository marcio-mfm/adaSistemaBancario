/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.gov.caixa.app;

import br.gov.caixa.app.Models.Contas.ContaCorrente;

/**
 *
 * @author Marcio
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrente c1 = new ContaCorrente();
        
        c1.deposito(100);
        c1.saque(125);
        c1.rendimento();
        c1.exibeSaldo();
        
    }
    
}
