package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_16_sobreposição;

import java.util.Date;

public class TesteSobreposicao {
    public static void main(String[] args) {
        ProdutoPerecivel pp = new ProdutoPerecivel();
        pp.descricao = "Carne";
        pp.dataValidade = new Date();
        pp.identificar();
    }
}
