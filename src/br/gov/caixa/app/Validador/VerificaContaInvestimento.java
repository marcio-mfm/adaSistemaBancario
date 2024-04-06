package br.gov.caixa.app.Validador;

import br.gov.caixa.app.Models.Users.Cliente;

public abstract class VerificaContaInvestimento {
    public boolean verificaContaInvestimento(Cliente cliente){
        if(cliente.isTemContaInvestimento()){
            return true;
        } else {
            return false;
        }
    }
}
