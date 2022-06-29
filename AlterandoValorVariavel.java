package src.raylanDDS112;

import java.util.Scanner;

public class AlterandoValorVariavel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorDoProduto = scanner.nextDouble();
        System.out.print("Digite o tipo de pagamento: 1 = (Á vista) // 2 = (Á prazo): ");
        Integer tipoDePagamento = scanner.nextInt();
        boolean pagamentoAVista = tipoDePagamento.equals(1);
        double juros = 0.0;
        if (!pagamentoAVista) {
            juros = 10.0;
        }
        double acrescimo = valorDoProduto * juros / 100;
        double valorTotal = valorDoProduto + acrescimo;
        System.out.print("Valor total: " + valorTotal);
        scanner.close();
    }
}