package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_1.composicao_de_objetos.Exercicio01;
/*
instanciando e acessando atributos do objeto
Utilizando o IntelliJ, vamos fazer este primeiro exercícios sobre Orientação a Objetos. Fique a vontade para criar outro projeto ou utilizar um existente.
Um pet shop te chamou para ajudar no controle dos animais que eles cuidam. Eles irão precisar de muitos serviços, o primeiro é mapear qual o nome, raça, sexo (macho ou fêmea) e idade.
1. Crie uma classe chamada "Cachorro" e adicione os atributos para nome, raça, sexo e idade.
2. Crie uma outra classe chamada "PetShop" para testarmos nossa classe "Cachorro". Adicione o método "main".
3. Agora vamos instanciar um objeto do tipo "Cachorro". Dentro do método "main" utilize a palavra-chave "new" para criar o objeto.
4. Agora que temos um objeto do tipo "Cachorro", vamos definir os atributos dele.
5. Agora, mostre na saída os valores deste objeto.
6. Execute o programa e veja o resultado na saída do console. Arrisque um pouco, crie outro objeto do tipo "Cachorro" e tente perceber que são objetos diferentes criados a partir de uma única classe.
 */
public class PetShop {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Bidu";
        cachorro.idade = 1;
        cachorro.raca = "Boxer";
        cachorro.sexo = 'M';
        System.out.println("Nome: " + cachorro.nome);
        System.out.println("Idade: " + cachorro.idade);
        System.out.println("Ra�a: " + cachorro.raca);
        System.out.println("Sexo: " + cachorro.sexo);
    }

}