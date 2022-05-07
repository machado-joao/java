import java.util.Scanner;

public class Ex32_v2 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = leia.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = leia.nextInt();
        leia.close();

        int[][] matriz = new int[linhas][colunas];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            } 
        }

        int[][] matrizComSomas = new int[linhas + 1][colunas + 1];
        for(int i = 0; i < matrizComSomas.length - 1; i++) {
            for(int j = 0; j < matrizComSomas[i].length - 1; j++) {
                matrizComSomas[i][j] = matriz[i][j];
                System.out.print(matrizComSomas[i][j] + " ");
            }
            System.out.println();
        }

        quebrarLinha();

        for(int i = 0; i < matrizComSomas.length; i++) {
            for(int j = 0; j < matrizComSomas[i].length; j++) {
                System.out.print(matrizComSomas[i][j] + " ");
            }
            System.out.println();
        }

        quebrarLinha();

        int somaLinha = 0, somaDiagonalPrincipal = 0;
        for(int i = 0; i < matrizComSomas.length; i++) {
            somaLinha = 0;
            for(int j = 0; j < matrizComSomas[i].length; j++) {
                somaLinha += matrizComSomas[i][j];
                if(i == j) {
                    somaDiagonalPrincipal += matrizComSomas[i][j];
                }
            }
            matrizComSomas[i][colunas] = somaLinha;
        }

        int somaColuna = 0;
        int lin = 0, col = 0;
        while(col < colunas) {
            somaColuna = 0;
            for(int i = 0; i < matrizComSomas.length; i++) {
                lin = i;
                somaColuna += matrizComSomas[i][col];
            }
            matrizComSomas[lin][col] = somaColuna;
            col++;
        }

        matrizComSomas[linhas][colunas] = somaDiagonalPrincipal;

        quebrarLinha();

        for(int i = 0; i < matrizComSomas.length; i++) {
            for(int j = 0; j < matrizComSomas[i].length; j++) {
                System.out.print(matrizComSomas[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void quebrarLinha() {
        System.out.print("\n\n");
    }

}
