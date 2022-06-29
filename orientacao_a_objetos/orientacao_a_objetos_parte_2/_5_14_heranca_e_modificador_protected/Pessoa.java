package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_14_heranca_e_modificador_protected;

public class Pessoa {
    String nome;
    protected int idade;
    public void seApresentar(){
        System.out.println("Olá, eu sou " + nome +
                ", e tenho " + idade + "anos.");
    }
}