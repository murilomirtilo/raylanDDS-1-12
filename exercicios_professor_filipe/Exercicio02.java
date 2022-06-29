package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculadora básica");
        System.out.print("Digite o primeiro número: ");
        Double primeiroNumero = scanner.nextDouble();
        System.out.print("Operações: Para soma digite (1), Para subtração digite (2), Para multiplicação digite (3), Para divisão digite (4): ");
        Integer operacao = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        Double segundoNumero = scanner.nextDouble();
        Double resultado = null;
        if (operacao.equals(1)) {
            resultado = primeiroNumero + segundoNumero;
        }
        if (operacao.equals(2)) {
            resultado = primeiroNumero - segundoNumero;
        }
        if (operacao.equals(3)) {
            resultado = primeiroNumero * segundoNumero;
        }
        if (operacao.equals(4)) {
            resultado = primeiroNumero / segundoNumero;
        }
        System.out.println("O resultado da operação é: " + resultado);
        scanner.close();
    }
}