package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.o_objeto_this;

import src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_1.composicao_de_objetos.Proprietario;

public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao;
    boolean biCombustivel;
    Proprietario dono;
    void alterarModelo(String modelo){
        if (modelo != null){
            this.modelo = modelo;
        }
    }
}