import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[][] a = new int[4][5];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();

        System.out.println("Matriz:");
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.println();
        }
    }

}
