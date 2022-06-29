package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número correspondente aos dias da semana de 1 a 7: ");
        Integer dia = scanner.nextInt();
        String diaDaSemana = null;
        switch(dia) {
            case 1: diaDaSemana = "Domingo";
                break;
            case 2: diaDaSemana = "Segunda-feira";
                break;
            case 3: diaDaSemana = "Terça-feira";
                break;
            case 4: diaDaSemana = "Quarta-feira";
                break;
            case 5: diaDaSemana = "Quinta-feira";
                break;
            case 6: diaDaSemana = "Sexta-feira";
                break;
            case 7: diaDaSemana = "Sábado";
                break;
            default:
                System.err.println("Digite um número válido!");
                System.exit(1);
        }
        System.out.println("O dia da semana é: " + diaDaSemana);
        scanner.close();
    }
}