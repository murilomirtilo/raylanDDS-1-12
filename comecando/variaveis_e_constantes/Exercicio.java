package src.raylanDDS112.comecando.variaveis_e_constantes;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        Double nota = scanner.nextDouble();

        Boolean passouDeAno = nota >= 70;

        System.out.println("----------------------------------------");

        if (passouDeAno) {
            System.out.println("Voce passou de ano!.");
        } else {
            System.out.println("Voce esta de recuperacao.");

        scanner.close();
        }
    }
}