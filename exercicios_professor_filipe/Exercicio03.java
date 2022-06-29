package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do produto: ");
        double precoDoProduto = scanner.nextDouble();
        byte minimoFreteGratis = 100;
        boolean precisaCobrarFrete = precoDoProduto >= minimoFreteGratis;
        if (precisaCobrarFrete) {
            byte frete = 15;
            double precoComFrete = precoDoProduto + frete;
            System.out.println("O valor total final é: R$" + precoComFrete);
        } else {
            System.out.println("O valor total final é: R$" + precoDoProduto);
        }
        scanner.close();
    }
}