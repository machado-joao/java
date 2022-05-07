import java.util.Scanner;

public class Ex25_v2 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Quantidade de linhas: ");
        int linhas = leia.nextInt();
        System.out.print("Quantidade de colunas: ");
        int colunas = leia.nextInt();
        leia.close();

        int[][] matriz = new int[linhas][colunas];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }

        System.out.print("\n\n\n");

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("i = " + i + " j = " + j);
                for(int x = 0; x < matriz.length; x++) {
                    for(int y = 0; y < matriz[x].length; y++) {
                        System.out.println("x = " + x + " y = " + y);
                        // Bubble sort
                        if(matriz[i][j] < matriz[x][y]) {
                            int aux = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = aux;
                        }
                    }
                }
            } 
        }
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); 
        }
    }

}
