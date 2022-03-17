import java.util.Random;
import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas das matrizes: ");
        int linha = sc.nextInt();
        System.out.print("Digite a quantidade de colunas das matrizes: ");
        int coluna = sc.nextInt();
        sc.close();

        int[][] matriz1 = new int[linha][coluna];
        int[][] matriz2 = new int[linha][coluna];
        Random gerador = new Random();
        System.out.println("Matriz 1:");
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", matriz1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Matriz 2:");
        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", matriz2[i][j]);
            }
            System.out.println();
        }
        int[][] matriz3 = new int[linha][coluna];
        System.out.println("Matriz 3 (soma das anteriores):");
        for(int i = 0; i < matriz3.length; i++) {
            for(int j = 0; j < matriz3[i].length; j++) {
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.printf("%d ", matriz3[i][j]);
            }
            System.out.println();
        }
    }

}
