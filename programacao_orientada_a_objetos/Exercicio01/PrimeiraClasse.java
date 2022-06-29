package src.raylanDDS112.programacao_orientada_a_objetos.Exercicio01;

public class PrimeiraClasse {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        produto.quantidadeEstoque = 15;

        exibirQuantidadeEmEstoque(produto);
    }

    private static void exibirQuantidadeEmEstoque(Produto produto) {
        System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidadeEstoque);
    }
}