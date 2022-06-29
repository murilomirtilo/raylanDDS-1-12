package src.raylanDDS112.programacao_orientada_a_objetos.Exercicio03;

public class Pedido {
    Integer codigo;
    Double subtotal;
    Double desconto;
    Double total;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getSubtotal() {
        return subtotal;

    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Double getTotal() {
        return subtotal - desconto;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}