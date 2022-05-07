public class Ex21_v2 {
    
    public static void main(String[] args) {
        int linha = 2;
        int colunaM1 = 3;
        int colunaM2 = 4;

        int[][] matriz1 = new int[linha][colunaM1];
        int[][] matriz2 = new int[linha][colunaM2];

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

        /* int[][] matriz3 = new int[matriz1.length + matriz2.length][];
        System.arraycopy(matriz1, 0, matriz3, 0, matriz1.length);
        System.arraycopy(matriz2, 0, matriz3, matriz1.length, matriz2.length); */

        int colunaM3 = colunaM1 + colunaM2;
        int[][] matriz3 = new int[linha][colunaM3];
        
        int auxiliarColuna;
        for(int i = 0; i < matriz3.length; i++) {
            auxiliarColuna = 0;
            for(int j = 0; j < matriz3[i].length; j++) {
                if(j < colunaM1) {
                    matriz3[i][j] = matriz1[i][j];
                } else {
                    matriz3[i][j] = matriz2[i][auxiliarColuna++];
                }
            }
        }
        
        System.out.println("Matriz 3:");
        for(int i = 0; i < matriz3.length; i++) {
            for(int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " "); 
            }
            System.out.println();
        }

        // Outra versão
        /*
        int n = 2, m = 3, p = 4;
        int[][] matriz1 = new int[n][m];
        int[][] matriz2 = new int[n][p];
        int[][] matriz3 = new int[n][m + p];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matriz1[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < p; j++) {
                matriz2[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m + p; j++) {
                if(j < m) {
                    matriz3[i][j] = matriz1[i][j];
                } else {
                    matriz3[i][j] = matriz2[i][j - m];
                }
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m + p; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
        */
    }

}
