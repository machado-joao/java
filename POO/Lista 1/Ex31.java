import java.util.Random;
import java.util.Scanner;

public class Ex31 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor inicial: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o valor final: ");
        int fim = sc.nextInt();
        sc.close();

        int n = 4;
        int matriz[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                do {
                    matriz[i][j] = gerador.nextInt(fim) + 1;
                } while(matriz[i][j] < inicio);
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }    
    }

}
