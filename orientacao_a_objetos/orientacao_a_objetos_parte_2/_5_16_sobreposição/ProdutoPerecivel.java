package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_16_sobreposição;

import java.util.Date;

public class ProdutoPerecivel extends Produto{
    protected Date dataValidade;
    public void identificar(){
        super.identificar();
        System.out.println("Minha data de validade é: " + dataValidade);
    }
}