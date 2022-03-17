import java.util.Random;

public class Ex10 {
    
    public static void main(String[] args) {
        int n = 4;
        int h[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < h.length; i++) {
            for(int j = 0; j < h[i].length; j++) {
                h[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", h[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos da diagonal secundária:");
        for(int i = 0; i < h.length; i++) {
            for(int j = 0; j < h[i].length; j++) {
                if((i + j) == (n - 1)) {
                    System.out.printf("%d ", h[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
