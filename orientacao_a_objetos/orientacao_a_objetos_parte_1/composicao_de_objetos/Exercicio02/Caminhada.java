package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_1.composicao_de_objetos.Exercicio02;

public class Caminhada {
    public void andar(Pessoa pessoa) {
        System.out.println("Eu \"" + pessoa.nome + "\""
                + " estou andando com o \"" + pessoa.cachorro.nome + "\"");
    }
}