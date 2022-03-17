import java.util.Random;

public class Ex15 {
    
    public static void main(String[] args) {
        int n = 4;
        int p[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < p.length; i++) {
            for(int j = 0; j < p[i].length; j++) {
                p[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", p[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos abaixo da diagonal principal (inclusa) e acima da diagonal secundária (inclusa):");
        for(int i = 0; i < p.length; i++) {
            for(int j = 0; j < p[i].length; j++) {
                if(i >= j || (i + j) <= (n - 1)) {
                    System.out.printf("%d ", p[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
