package br.gov.caixa.app.Enum;

public enum Classificacao {

        CPF("Pessoa Física", 0.0), CNPJ("Pessoa Jurídica", 0.005);

        private final String descricao;
        private final double taxaSaque;

        Classificacao(String descricao, double taxaSaque){
                this.descricao = descricao;
                this.taxaSaque = taxaSaque;
        }

        public String getDescricao() {
                return descricao;
        }

        public double getTaxaSaque() {
                return taxaSaque;
        }
}
