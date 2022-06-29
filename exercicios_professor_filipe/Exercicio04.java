package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite abaixo os valores gastos com...");
        Double total = 0.0;
        System.out.print("Informe o valor da conta de luz: ");
        total += scanner.nextDouble();
        System.out.print("Informe o valor da conta de água: ");
        total += scanner.nextDouble();
        System.out.print("Informe o valor da conta de telefone: ");
        total += scanner.nextDouble();
        System.out.print("Informe o valor da mensalidade escolar: ");
        total += scanner.nextDouble();
        System.out.print("Informe o valor da fatura do cartão: ");
        total += scanner.nextDouble();
        System.out.print("Informe o valor dos gastos com supermercado: ");
        total += scanner.nextDouble();
        System.out.print("O valor total foi de: R$" + total);
        scanner.close();
    }
}