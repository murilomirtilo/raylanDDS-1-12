package src.raylanDDS112.orientacao_a_objetos.orientacao_a_objetos_parte_2.enumeracoes_5_12;

public enum OperacaoAritmetica {
    ADICAO{
        public int operacao(int x, int y) {
            return x + y;
        }
    }, SUBTRACAO {
        @Override
        public int operacao(int x, int y) {
            return x - y;
        }
    };
    public abstract int operacao(int x, int y);
}
