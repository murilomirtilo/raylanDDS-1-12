package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.modificador_de_acesso_default_5_9;

public class TreinadorCachorro {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Nick");
        DonoCachorro donoCachorro = new DonoCachorro();
        donoCachorro.ensinarCachorroSentar(cachorro);
    }
}
