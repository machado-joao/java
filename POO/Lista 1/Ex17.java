import java.util.Random;

public class Ex17 {
    
    public static void main(String[] args) {
        int n = 4;
        int r[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < r.length; i++) {
            for(int j = 0; j < r[i].length; j++) {
                r[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", r[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos acima da diagonal principal (inclusa) e abaixo da diagonal secundária (inclusa):");
        for(int i = 0; i < r.length; i++) {
            for(int j = 0; j < r[i].length; j++) {
                if(i <= j || (i + j) >= (n - 1)) {
                    System.out.printf("%d ", r[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
