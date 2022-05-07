public class Ex14_v2 {
    
    public static void main(String[] args) {
        int n = 3;
        int[][] matriz = new int[n][n];
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if((i + j) < n - 1) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
