import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:\n");
		int parametroUm = terminal.nextInt();
		System.out.println("\nDigite o segundo parâmetro:\n");
		int parametroDois = terminal.nextInt();
        
        try {
			
			contar(parametroUm, parametroDois);
	
		}catch (ParametrosInvalidosException) {
            System.out.println("Erro: " + e.getMessage());
			
		}
		
	}
	static void contagem(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		
		int contagem = parametroDois - parametroUm;
		
	}
}
