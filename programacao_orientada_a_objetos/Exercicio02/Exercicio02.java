package src.raylanDDS112.programacao_orientada_a_objetos.Exercicio02;

public class Exercicio02 {

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Notebook XZ10";
        produto.quantidadeEstoque = 16;
        produto.eNecessarioReporEstoque(produto);
    }
}