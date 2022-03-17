import java.util.Scanner;
import java.util.Random;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite a dimensão da matriz: ");
            n = sc.nextInt();
        } while(n < 1 && n > 20);
        sc.close();
        
        int c[][] = new int[n][n];
        System.out.println("Matriz:");
        Random gerador = new Random();
        for(int i = 0; i < c.length; i++) {
            for(int j = 0; j < c[i].length; j++) {
                c[i][j] = gerador.nextInt(100);
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }
    }
    
}
