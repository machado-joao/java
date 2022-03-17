public class Ex20 {
    
    public static void main(String[] args) {
        int n = 5;
        int matriz[][] = new int[n][n];
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println("Ampulheta:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(i <= j && (i + j) <= (n - 1) || i >= j && (i + j) >= (n - 1)) {
                    System.out.printf("%d ", matriz[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }   
    }

}
