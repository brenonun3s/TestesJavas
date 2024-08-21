public class ExemploTratamentoExcecoes {
    public static void main(String[] args) {
        try {
            // Código que pode gerar uma exceção
            int resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            // Tratamento específico para a exceção ArithmeticException
            System.out.println("Erro de divisão por zero: " + e.getMessage());
        } finally {
            // Bloco que sempre será executado, independentemente de exceções
            System.out.println("Finalizando o programa.");
        }
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
