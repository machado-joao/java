public class Ex28_v2 {

    public static void main(String[] args) {
        int n = 3;
        int m = 4;
        int[][] matriz = new int[n][m];

        for(int i = 0; i < matriz.length; i++) {
           for(int j = 0; j < matriz[i].length; j++) {
               matriz[i][j] = (int) (Math.random() * 10);
               System.out.print(matriz[i][j] + " ");
           }
           System.out.println();
        }

        for(int col = (m - 1); col >= 0; col--) {
           for(int lin = (n - 1); lin >= 0; lin--) {
              for(int linComparacao = (lin - 1); linComparacao >= 0; linComparacao--) {
                  if(matriz[lin][col] < matriz[linComparacao][col]) {
                      System.out.println("Elemento: " + matriz[lin][col]);
                      System.out.println("Elemento comparacao: " + matriz[linComparacao][col]);
                      int aux = matriz[lin][col];
                      matriz[lin][col] = matriz[linComparacao][col];
                      matriz[linComparacao][col] = aux;
                  }
              } 
           } 
        }

        System.out.println("Colunas ordenadas:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
