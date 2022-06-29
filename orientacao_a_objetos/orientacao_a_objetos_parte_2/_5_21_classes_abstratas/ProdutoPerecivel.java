package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_21_classes_abstratas;

public class ProdutoPerecivel extends Produto{
    String dataValidade;
    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
}