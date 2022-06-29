package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTraco();
        imprimir("Digite o número que você deseja saber a tabuada de 0 a 10: ");
        Integer numeroEscolhido = scanner.nextInt();
        byte limiteTabuada = 10;
        Boolean numeroValido = numeroEscolhido <= limiteTabuada;
        if (!numeroValido) {
            encerrarProgramaPorCausaDeNumeroInvalido();
        }
        imprimirTabuada(numeroEscolhido, 0);
        imprimirTraco();
        scanner.close();
    }
    static void imprimirTraco() {
        System.out.println("----------------------------------------------");
    }
    static void imprimir(String texto) {System.out.print(texto);
    }
    static void encerrarProgramaPorCausaDeNumeroInvalido() {
        System.err.println("Número inválido!");
        System.exit(1);
    }
    //static void imprimirTabuada(Integer multiplicando) {                                                                  // Feito por mim.
      //  for(int multiplicador = 0; multiplicador <= 10; multiplicador++) {
        //    System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));
        //}
    //}
    static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
        if(++multiplicador <= 10) {
            imprimirTabuada(multiplicando, multiplicador);
        }
    }
}