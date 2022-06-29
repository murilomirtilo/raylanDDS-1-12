package src.raylanDDS112.exercicios_professor_filipe;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o valor do produto: ");
        double precoDoProduto = scanner.nextDouble();
        System.out.print("Informe a quantidade que você deseja: ");
        int quantidadeDeProduto = scanner.nextInt();
        double subtotalDoProduto = precoDoProduto * quantidadeDeProduto;
        byte dezUnidades = 10;
        boolean quantidadeDeProdutosMaiorQueDez = quantidadeDeProduto > dezUnidades;
        if (quantidadeDeProdutosMaiorQueDez) {
            double descontoDeDezPorCento = 0.9;
            double subtotalComDesconto = subtotalDoProduto * descontoDeDezPorCento;
            System.out.println("O valor total final é: R$" + subtotalComDesconto);
        } else {
            System.out.println("O valor total final é: R$" + subtotalDoProduto);
        }
        scanner.close();
    }
}