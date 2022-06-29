package src.raylanDDS112;

import java.util.Scanner;

public class OlaMundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá Usuário!");
        System.out.print("Informe seu primeiro nome: ");
        String nome = scanner.nextLine();
        System.out.print("Informe seu sobrenome: ");
        String sobrenome = scanner.nextLine();
        System.out.print("Seu nome é " + nome +" " +sobrenome);
        scanner.close();
    }
}