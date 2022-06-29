package src.raylanDDS112.programacao_orientada_a_objetos.Exercicio01;

public class Exercicio01 {

    public static void main(String[] args) {
        Produto produto = new Produto();
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Informe a quantidade de produtos no estoque: ");
        //produto.quantidade = scanner.nextInt();
        produto.quantidadeEstoque = 7;
        produto.nome = "Smartphone";
        produto.precoUnitario = 500.0;
        verificarSeENecessarioReporOEstoque(produto);
        exibirQuantidadeEmEstoque(produto);
    }
    private static void verificarSeENecessarioReporOEstoque(Produto produto) {
        boolean precisaReporEstoque = produto.quantidadeEstoque < 10;
        if (precisaReporEstoque) {
            System.out.print("É necessário repor o estoque.");
            System.exit(1);
        }
    }
    private static void exibirQuantidadeEmEstoque(Produto produto) {
        System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidadeEstoque + " unidade(s)");
    }
}