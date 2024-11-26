public class Produto {
    private String nome;
    private double precoCusto;
    private double precoVenda;

    // Construtor
    public Produto(String nome, double precoCusto, double precoVenda) {
        this.nome = nome;
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
    }

    // Método para calcular o lucro
    public double calcularLucro() {
        return precoVenda - precoCusto;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    // Classe ProdutoAlimenticio (classe interna estática)
    public static class ProdutoAlimenticio extends Produto {
        private String dataValidade;
        private String informacoesNutricionais;

        // Construtor
        public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
            super(nome, precoCusto, precoVenda); // Chama o construtor da classe pai
            this.dataValidade = dataValidade;
            this.informacoesNutricionais = informacoesNutricionais;
        }

        // Getters
        public String getDataValidade() {
            return dataValidade;
        }

        public String getInformacoesNutricionais() {
            return informacoesNutricionais;
        }
    }

    // Classe ProdutoVestuario (classe interna estática)
    public static class ProdutoVestuario extends Produto {
        private String tamanho;
        private String cor;
        private String material;

        // Construtor
        public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
            super(nome, precoCusto, precoVenda); // Chama o construtor da classe pai
            this.tamanho = tamanho;
            this.cor = cor;
            this.material = material;
        }

        // Getters
        public String getTamanho() {
            return tamanho;
        }

        public String getCor() {
            return cor;
        }

        public String getMaterial() {
            return material;
        }
    }
}
