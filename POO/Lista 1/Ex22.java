public class Ex22 {
    
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int p = 5;

        // Não permite que m seja maior que p
        if(m > p) {
            int aux = m;
            m = p;
            p = aux;
        }

        int[][] matriz1 = new int[n][m];
        int[][] matriz2 = new int[n][p];
        int[][] matriz3 = new int[n][m + p];

        // Gera e imprime os elementos da 1a matriz
        System.out.println("Matriz 1:");
        for(int i = 0; i < matriz1.length; i++) {
            for(int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }

        // Gera e imprime os elementos da 2a matriz
        System.out.println("Matriz 2:");
        for(int i = 0; i < matriz2.length; i++) {
            for(int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = (int) (Math.random() * 9) + 1;
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }

        int[][] maiorMatriz;
        int[][] menorMatriz;
        if(m > p) {
            maiorMatriz = matriz1;
            menorMatriz = matriz2;
        } else {
            maiorMatriz = matriz2;
            menorMatriz = matriz1;
        }

        // Prenche a 3a matriz com os elementos da 1a e 2a matriz
        int i1 = 0, i2 = 0, j1 = 0, j2 = 0;
        for(int i = 0; i < matriz3.length; i++) {
            j1 = 0;
            j2 = 0;
            for(int j = 0; j < matriz3[i].length; j++) {
                if(j % 2 == 0 && j1 < m) {
                    matriz3[i][j] = menorMatriz[i1][j1++];
                } else {
                    matriz3[i][j] = maiorMatriz[i2][j2++];
                }
            }
            i1++;
            i2++;
        }

        // Imprime a 3a matriz
        System.out.println("Matriz 3:");
        for(int i = 0; i < matriz3.length; i++) {
            for(int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + " ");
            }
            System.out.println();
        }
    }

}
