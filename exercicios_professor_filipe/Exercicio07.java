package src.raylanDDS112.exercicios_professor_filipe;

public class Exercicio07 {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        for(int i = 0; i < numeros.length; i++) {
            Integer produto = numeros[i];
            System.out.println("Produto de código: " + produto);
            if (produto.equals(225)) {
                System.out.println("Produto encontrado!");
                break;
            }
        }
    }
}