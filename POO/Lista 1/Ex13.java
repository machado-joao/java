import java.util.Random;

public class Ex13 {
    
    public static void main(String[] args) {
        int n = 4;
        int m[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", m[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos abaixo da diagonal secundária (exclusa):");
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if((i + j) >= n) {
                    System.out.printf("%d ", m[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
