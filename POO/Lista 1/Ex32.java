import java.util.Random;
import java.util.Scanner;

public class Ex32 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linha = sc.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        int coluna = sc.nextInt();
        sc.close();

        int matriz[][] = new int[linha + 1][coluna + 1];
        Random gerador = new Random();
        for(int i = 0; i < (matriz.length - 1); i++) {
            for(int j = 0; j < (matriz[i].length - 1); j++) {
                matriz[i][j] = gerador.nextInt(9);
            }
        }
        int somaLinha[] = new int[linha], somaColuna[] = new int[coluna], posicaoLinha = 0, posicaoColuna = 0, posicao = 0;
        for(int i = 0; i < (matriz.length - 1); i++) {
            posicaoColuna = 0;
            for(int j = 0; j < (matriz[i].length - 1); j++) {
                somaLinha[posicaoLinha] += matriz[i][j];
                somaColuna[posicaoColuna++] += matriz[i][j];
            }
            posicaoColuna = 0;
            matriz[posicao++][coluna] = somaLinha[posicaoLinha];
            posicaoLinha++;
            for(int k = 0; k < coluna; k++) {
                matriz[linha][k] = somaColuna[posicaoColuna++];
            }
        }
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) {
           for(int j = 0; j < matriz[i].length; j++) {
               System.out.printf("%d ", matriz[i][j]);
           }
           System.out.println();
        }
    }

}
