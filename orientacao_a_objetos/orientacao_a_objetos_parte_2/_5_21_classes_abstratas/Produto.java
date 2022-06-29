package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_21_classes_abstratas;

public abstract class Produto {
    String descricao;
    public abstract void imprimirDescricao();
    public String getDescricao() {
        return descricao;
    }
}