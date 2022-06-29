package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio05 {
    static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
    static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Informe a quantidade de tempo que você contribuiu com a previdência: ");
        int tempoContribuido = scanner.nextInt();
        boolean idadeMinimaParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
        boolean tempoMinimoDeContribuicao = tempoContribuido >= TEMPO_MINIMO_DE_CONTRIBUICAO;
        boolean podeAposentar = idadeMinimaParaAposentar && tempoMinimoDeContribuicao;
        if (podeAposentar)
            System.out.print("Você pode se aposentar!");
        else
            System.out.print("Você não pode se aposentar!");
        scanner.close();
    }
}