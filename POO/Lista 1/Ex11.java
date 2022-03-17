import java.util.Random;

public class Ex11 {
    
    public static void main(String[] args) {
        int n = 4;
        int k[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < k.length; i++) {
            for(int j = 0; j < k[i].length; j++) {
                k[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", k[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos abaixo da diagonal principal (inclusa):");
        for(int i = 0; i < k.length; i++) {
            for(int j = 0; j < k[i].length; j++) {
                if(i == j || i > j) {
                    System.out.printf("%d ", k[i][j]);
                }
            }
            System.out.println();
        }
    }

}
