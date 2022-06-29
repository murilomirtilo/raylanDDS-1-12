package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio06 {
    static final int NOTA_MINIMA_TOTAL = 150;
    static final int NOTA_MINIMA = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe suas notas: ");
        System.out.print("Português: ");
        double notaDePortugues = scanner.nextDouble();
        System.out.print("Matemática: ");
        double notaDeMatematica = scanner.nextDouble();
        boolean acimaDaNotaMinimaEmPortugues = notaDePortugues >= NOTA_MINIMA;
        boolean acimaDaNotaMinimaEmMatematica = notaDeMatematica >= NOTA_MINIMA;
        double notaTotal = notaDePortugues + notaDeMatematica;
        boolean temNotaParaPassar = notaTotal >= NOTA_MINIMA_TOTAL;
        boolean passou = temNotaParaPassar && acimaDaNotaMinimaEmPortugues && acimaDaNotaMinimaEmMatematica;
        if (passou) {
            System.out.println("Você passou!");
        } else {
            System.out.println("Você não passou!");
        }
        scanner.close();
    }
}