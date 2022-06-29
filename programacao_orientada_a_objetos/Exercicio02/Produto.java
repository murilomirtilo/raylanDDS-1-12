package src.raylanDDS112.programacao_orientada_a_objetos.Exercicio02;

public class Produto {

    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    String nome;

    Integer quantidadeEstoque;

    public boolean eNecessarioReporEstoque(Produto produto) {
        if (produto.quantidadeEstoque < QUANTIDADE_MINIMA_ESTOQUE) {
            System.out.println("Necessário repor estoque do produto " + produto.nome + " quantidade em estoque: " + produto.quantidadeEstoque);
        }
        else {
            System.out.println("Não é necessário repor o estoque");
        }
        return false;
    }
}