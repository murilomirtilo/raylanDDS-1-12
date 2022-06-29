package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.desafio_static_e_final_5_11;

public class TesteMatematica {
    public static void main(String[] args) {
        int numeroFibonacci = MatematicaUtil.calcularFibonacci(8);
        System.out.println("Número de Fibonacci da posição 8: " + numeroFibonacci);
        double areaCirculo = MatematicaUtil.calcularAreaCirculo(2);
        System.out.println("Área do círculo: " + areaCirculo);
    }
}