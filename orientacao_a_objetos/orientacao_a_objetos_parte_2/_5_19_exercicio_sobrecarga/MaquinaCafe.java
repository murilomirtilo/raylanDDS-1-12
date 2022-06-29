package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_19_exercicio_sobrecarga;

public class MaquinaCafe {
    private int acucarDisponivel;

    public static void fazerCafe(int acucarNecessario, int acucarDisponivel){
        if (acucarNecessario < acucarDisponivel) {
            System.out.println("fazendo cafe com açucar");
        }
        else {
            System.out.println("fazendo sem acucar pq acabou");
        }
    }
    public void fazerCafe() {
    }
}
