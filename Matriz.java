public class Matriz {
    private int[][] mat;

    public void criarMatriz(int linha, int coluna) {
        this.mat = new int[linha][coluna];
        for(int i=0; i<linha; i++) {
            for(int j=0; j<coluna; j++) {
                this.mat[i][j]=i+j+1;
            }
        }
    }

    public void imprimirMatriz() {
        for(int i=0; i<this.mat.length; i++) {
            for(int j=0; j<this.mat[0].length; j++) {
                System.out.print(this.mat[i][j]+" ");
            }
            System.out.println();
    }

    public String buscarValor(int linha, int coluna) {
        return "O valor é: "+this.mat[linha][coluna];
    }
}