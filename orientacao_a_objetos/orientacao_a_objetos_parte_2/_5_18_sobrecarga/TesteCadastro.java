package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2._5_18_sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastroPessoa = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José", 32);
        cadastroPessoa.cadastrar(pessoa);
        cadastroPessoa.cadastrar("Maria", 25);
    }
}
