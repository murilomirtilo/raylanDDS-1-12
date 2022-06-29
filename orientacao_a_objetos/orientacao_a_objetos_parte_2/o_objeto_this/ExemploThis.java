package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.o_objeto_this;

public class ExemploThis {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Palio";
        System.out.println("Modelo antes: " + carro.modelo);
        carro.alterarModelo("Civic");
    }
}