package src.raylanDDS112.programacao_orientada_a_objetos.metodo_instancia;

public class MetodoInstancia {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.primeiroNome = "Raylan";
        cliente.ultimoNome = "Freire";
        cliente.telefone = "27995103070";
        cliente.email = "raylancfreire@hotmail.com";

        Cliente cliente2 = new Cliente();
        cliente2.primeiroNome = "Renan";
        cliente2.ultimoNome = "Freire";
        cliente2.telefone = "27999999999";

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", " + cliente.obterDDD());
        System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", " + cliente2.obterDDD());
    }
}