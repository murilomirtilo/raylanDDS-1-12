package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.desafio_pacotes_e_enumeradores_5_13;

import static src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.desafio_pacotes_e_enumeradores_5_13.SituacaoConta.*;

public class ContaPagar {
    private String descricao;
    private Double valor;
    private String dataVencimento;
    private Fornecedor fornecedor;
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) {
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }

    public ContaPagar() {
    }


    SituacaoConta situacaoConta;


    public SituacaoConta getSituacaoConta() {
        return situacaoConta;
    }

    public void cancelar() {
        if (this.situacaoConta == CANCELADA) {
            System.out.println("CONTA JA CANCELADA, IMPOSSIBILITADO DE CANCELAR");
        }
        if (this.situacaoConta == PAGA) {
            System.out.println("CONTA JA PAGA, IMPOSSIBILITADO DE CANCELAR");
        }
        this.situacaoConta = CANCELADA;
        System.out.println("Cancelando conta " + getDescricao());
    }
    public void pagar() {
        if (this.situacaoConta == CANCELADA) {
            System.out.println("Não pode pagar uma conta que está cancelada: " + getDescricao());
            return;
        }
        if (this.situacaoConta == PAGA) {
            System.out.println("Não pode paga uma conta que já está paga: " + getDescricao());
            return;
        }
        SituacaoConta situacaoConta = PENDENTE;
        System.out.println("Pagando conta " +  getDescricao() + " no valor de R$" + getValor() + " e vencimento em " + getDataVencimento() + " do fornecedor " + fornecedor.getNome());
        this.situacaoConta = PAGA;

    }
}