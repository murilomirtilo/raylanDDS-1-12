package src.raylanDDS112;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CALCULO - Quadrado de um número");
        System.out.print("Informe um número: ");
        Double numero = scanner.nextDouble();
        Double quadrado = numero * numero;
        System.out.print("O quadrado no número é: " + quadrado);
        scanner.close();
    }
}
