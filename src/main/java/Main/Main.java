public class Main {
    public static void main(String[] args) {
        // Criando um Produto Alimentício
        Produto.ProdutoAlimenticio produtoAlimenticio = new Produto.ProdutoAlimenticio(
                "Biscoito",
                2.50,  // preço de custo
                5.00,   // preço de venda
                "30/12/2024",  // data de validade
                "200g, 10% de gordura" // informações nutricionais
        );

        // Mostrando informações do Produto Alimentício
        System.out.println("Produto Alimentício:");
        System.out.println("Nome: " + produtoAlimenticio.getNome());
        System.out.println("Preço de Custo: R$ " + produtoAlimenticio.getPrecoCusto());
        System.out.println("Preço de Venda: R$ " + produtoAlimenticio.getPrecoVenda());
        System.out.println("Data de Validade: " + produtoAlimenticio.getDataValidade());
        System.out.println("Informações Nutricionais: " + produtoAlimenticio.getInformacoesNutricionais());
        System.out.println("Lucro: R$ " + produtoAlimenticio.calcularLucro());
        System.out.println();

        // Criando um Produto de Vestuário
        Produto.ProdutoVestuario produtoVestuario = new Produto.ProdutoVestuario(
                "Camiseta",
                15.00,  // preço de custo
                30.00,   // preço de venda
                "M",  // tamanho
                "Azul", // cor
                "Algodão" // material
        );

        // Mostrando informações do Produto de Vestuário
        System.out.println("Produto de Vestuário:");
        System.out.println("Nome: " + produtoVestuario.getNome());
        System.out.println("Preço de Custo: R$ " + produtoVestuario.getPrecoCusto());
        System.out.println("Preço de Venda: R$ " + produtoVestuario.getPrecoVenda());
        System.out.println("Tamanho: " + produtoVestuario.getTamanho());
        System.out.println("Cor: " + produtoVestuario.getCor());
        System.out.println("Material: " + produtoVestuario.getMaterial());
        System.out.println("Lucro: R$ " + produtoVestuario.calcularLucro());
    }
}
