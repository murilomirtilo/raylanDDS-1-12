package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.Construtores;

public class Pessoa {
    String nome;
    int idade;
    public Pessoa(String nome) {
        this.nome = nome;
    }
    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
}
