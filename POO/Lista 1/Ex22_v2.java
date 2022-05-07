public class Ex22_v2 {
    
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int p = 5;

        if(m > p) {
            int aux = m;
            m = p;
            p = aux;
        }

        int[][] matriz1 = new int[n][m];
        int[][] matriz2 = new int[n][p];
        int[][] matriz3 = new int[n][m + p];

        System.out.println("Matriz 1:");
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz 2:");
        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        int i1 = 0, i2 = 0, j1 = 0, j2 = 0;
        for(int i = 0; i < matriz3.length; i++) {
            j1 = 0;
            j2 = 0;
            for(int j = 0; j < matriz3[i].length; j++) {
                if(j % 2 == 0 && j1 < m) {
                    matriz3[i][j] = matriz1[i1][j1++];
                } else {
                    matriz3[i][j] = matriz2[i2][j2++];
                }
            }
            i1++;
            i2++;
        }

        System.out.println("Matriz 3:");
        for(int i = 0; i < matriz3.length; i++) {
            for(int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
    }

}
