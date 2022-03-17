import java.util.Random;

public class Ex18 {
    
    public static void main(String[] args) {
        int n = 4;
        int s[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < s[i].length; j++) {
                s[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", s[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos acima da diagonal principal (inclusa) e acima da diagonal secundária (inclusa):");
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < s[i].length; j++) {
                if(i <= j || (i + j) <= (n - 1)) {
                    System.out.printf("%d ", s[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
