package src.raylanDDS112.programacao_orientada_a_objetos.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setNome("Raylan Freire");
        cliente.setTelefone("2799999999999");

        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Ultimo nome: " + cliente.getUltimoNome());
    }
}