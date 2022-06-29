package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.enumeracoes_5_12;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO;
        int resultado1 = o1.operacao(5, 3);
        System.out.println("O resultado é: " +  resultado1);
        OperacaoAritmetica o2 = OperacaoAritmetica.SUBTRACAO;
        int resultado2 = o2.operacao(5, 3);
        System.out.println("O resultado é: " +  resultado2);
    }
}
