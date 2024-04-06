package br.gov.caixa.app.Enum;

public enum Classificacao {

        CPF("Pessoa Física", 0.0f, 0.01f), CNPJ("Pessoa Jurídica", 0.005f, 0.02f);

        private final String descricao;
        private final float taxaSaque;
        private final float taxaInvestimento;

        Classificacao(String descricao, float taxaSaque, float taxaInvestimento){
                this.descricao = descricao;
                this.taxaSaque = taxaSaque;
                this.taxaInvestimento = taxaInvestimento;
        }

        public String getDescricao() {
                return descricao;
        }

        public float getTaxaSaque() {
                return taxaSaque;
        }

        public float getTaxaInvestimento() { return taxaInvestimento; }
}
