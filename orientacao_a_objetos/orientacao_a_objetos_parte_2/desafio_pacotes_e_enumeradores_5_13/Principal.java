package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.desafio_pacotes_e_enumeradores_5_13;

public class Principal {
    public static void main(String[] args) {
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");
        ContaPagar conta1 = new ContaPagar();
        conta1.setDescricao("Aluguel da matriz");
        conta1.setValor(1230d);
        conta1.setDataVencimento("10/05/2012");
        conta1.setFornecedor(imobiliaria);
        ContaPagar conta2 = new ContaPagar("Compras do mês", 390d, "19/05/2012", mercado);
        ContaPagar conta3 = new ContaPagar("Aluguel da filial", 700d, "11/05/2012", mercado);
        // pagamento de conta pendente (ok, deve funcionar)
        conta1.pagar();
        // tentativa de pagar uma conta cancelada (não deve aceitar pagamento)
        conta2.cancelar();
        conta2.pagar();
        // tentativa de pagar uma conta duas vezes (não deve aceitar na segunda vez)
        conta3.pagar();
        conta3.pagar();

    }
}