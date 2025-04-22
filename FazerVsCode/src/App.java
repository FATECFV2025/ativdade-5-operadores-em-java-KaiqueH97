public class App {
    public static void main(String[] args) throws Exception {
        operadores op = new operadores();

        // Testes de operadores aritméticos
        System.out.println("O resultado é:" +op.adicao(100, 10));
        System.out.println("O resultado é:" +op.subtracao(100, 10));
        System.out.println("O resultado é:" +op.multiplicacao(100, 10));
        System.out.println("O resultado é:" +op.divisao(100, 100));

        // Testes de operadores de atribuição
        System.out.println("Atribuição com soma (+=): " + op.atribuicaoSoma(100, 10));
        System.out.println("Atribuição com subtração (-=): " + op.atribuicaoSubtracao(100, 10));
        System.out.println("Atribuição com multiplicação (*=): " + op.atribuicaoMultiplicacao(100, 10));
        System.out.println("Atribuição com divisão (/=): " + op.atribuicaoDivisao(100, 10));

        // Testes de operadores de comparação
        System.out.println("É igual? 10 == 10: " + op.igual(10, 10));
        System.out.println("É diferente? 10 != 10: " + op.diferente(100, 10));
        System.out.println("Maior que? 100 > 10: " + op.maiorQue(100, 10));
        System.out.println("Menor que? 100 < 10: " + op.menorQue(100, 10));
        System.out.println("Maior ou igual? 10 >= 10: " + op.maiorOuIgual(10, 10));
        System.out.println("Menor ou igual? 110 <= 10: " + op.menorOuIgual(110, 10));

        // Testes de operadores lógicos
        System.out.println("Lógico E (true && false): " + op.eLogico(true, false));
        System.out.println("Lógico OU (true || false): " + op.ouLogico(true, false));
        System.out.println("Negação (!true): " + op.negacao(true));
    }
}

