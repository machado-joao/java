import java.util.Random;

public class Ex14 {
    
    public static void main(String[] args) {
        int n = 4;
        int o[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < o.length; i++) {
            for(int j = 0; j < o[i].length; j++) {
                o[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", o[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos acima da diagonal secundária (inclusa):");
        for(int i = 0; i < o.length; i++) {
            for(int j = 0; j < o[i].length; j++) {
                if((i + j) <= (n - 1)) {
                System.out.printf("%d ", o[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
