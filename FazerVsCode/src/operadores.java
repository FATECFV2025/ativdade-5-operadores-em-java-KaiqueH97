public class operadores {
    // Operações aritméticas
    public float adicao (float v1, float v2){
        return v1+v2;
    }

    public float subtracao (float v1, float v2){
        return v1-v2;
    }

    public float multiplicacao (float v1, float v2){
        return v1*v2;
    }

    public float divisao (float v1, float v2){
        // Evitar divisão por zero
        if (v2 == 0) {
            System.out.println("Erro na divisão.");
            return 0;
        }
        return v1 / v2;
    }

    // Operadores de atribuição
    public int atribuicaoSoma(int valor, int incremento) {
        valor += incremento;
        return valor;
    }

    public int atribuicaoSubtracao(int valor, int decremento) {
        valor -= decremento;
        return valor;
    }

    public int atribuicaoMultiplicacao(int valor, int multiplicador) {
        valor *= multiplicador;
        return valor;
    }

    public int atribuicaoDivisao(int valor, int divisor) {
        if (divisor == 0) {
            System.out.println("Erro na divisão.");
            return valor;
        }
        valor /= divisor;
        return valor;
    }

    // Operadores de comparação
    public boolean igual(int a, int b) {
        return a == b;
    }

    public boolean diferente(int a, int b) {
        return a != b;
    }

    public boolean maiorQue(int a, int b) {
        return a > b;
    }

    public boolean menorQue(int a, int b) {
        return a < b;
    }

    public boolean maiorOuIgual(int a, int b) {
        return a >= b;
    }

    public boolean menorOuIgual(int a, int b) {
        return a <= b;
    }

    // Operadores lógicos
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean negacao(boolean a) {
        return !a;
    }
    
}
