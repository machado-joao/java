import java.util.Random;

public class Ex09 {
    
    public static void main(String[] args) {
        int n = 4;
        int g[][] = new int[n][n];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < g[i].length; j++) {
                g[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", g[i][j]);
            }
            System.out.println();
        }
        System.out.println("Elementos da diagonal principal:");
        for(int i = 0; i < g.length; i++) {
            for(int j = 0; j < g[i].length; j++) {
                if(i == j) {
                    System.out.printf("%d ", g[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }    
    }

}
