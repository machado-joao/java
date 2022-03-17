import java.util.Random;

public class Ex16 {
    
    public static void main(String[] args) {
        int n = 4;
        int q[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < q.length; i++) {
            for(int j = 0; j < q[i].length; j++) {
                q[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", q[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos abaixo da diagonal principal (inclusa) e abaixo da diagonal secundária (inclusa):");
        for(int i = 0; i < q.length; i++) {
            for(int j = 0; j < q[i].length; j++) {
                if(i >= j || (i + j) >= (n - 1)) {
                    System.out.printf("%d ", q[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
