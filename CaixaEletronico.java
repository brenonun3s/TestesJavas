public class CaixaEletronico {


    // Programa para ilustração de Condicional Simples e Condicional Composta

    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo){
        saldo = saldo - valorSolicitado;
        System.out.println("Novo Saldo:" + saldo);

        }
        else
            System.out.println("SALDO INSUFICIENTE");
    }
}
