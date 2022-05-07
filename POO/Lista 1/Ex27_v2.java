// import java.util.Arrays; Import necessário apenas para usar o método parallelSort

public class Ex27_v2 {
    
    public static void main(String[] args) {
        int n = 3, m = 4;

        int[][] matriz = new int[n][m];

        for(int i = 0; i < matriz.length; i++) {
           for(int j = 0; j < matriz[i].length; j++) {
               matriz[i][j] = (int) (Math.random() * 10);
               System.out.print(matriz[i][j] + " ");
           }
           System.out.println(); 
        }

        System.out.print("\n\n\n");

        for(int i = 0; i < matriz.length; i++) {
            for(int j = matriz[i].length - 1; j >= 0; j--) {
                for(int x = j - 1; x >= 0; x--) {
                    if(matriz[i][j] < matriz[i][x]) {
                        System.out.println("i = " + i + " j = " + j);
                        System.out.println("i = " + i + " x = " + x);
                        int aux = matriz[i][j];
                        matriz[i][j] = matriz[i][x];
                        matriz[i][x] = aux;
                    }
                }
            }
            System.out.println(); 
        }

        // Método alternativo para ordenar as linhas da matriz
        /* for(int linha = 0; linha < matriz.length; linha++) {
            Arrays.parallelSort(matriz[linha]);
        } */

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " "); 
            }
            System.out.println();            
        }
    }

}
