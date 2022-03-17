import java.util.Random;

public class Ex07 {
    
    public static void main(String[] args) {
        int n = 4, m = 4;
        int[][] matriz = new int[n][m];
        Random gerador = new Random();
        int maior = 0, menor = 0;
        String posMaior = "", posMenor = "";
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", matriz[i][j]);
                if(i == 0 && j == 0) {
                    maior = matriz[i][j];
                    menor = matriz[i][j];
                    posMaior = String.format("[%d][%d]", i, j);
                    posMenor = String.format("[%d][%d]", i, j);
                }
            }
            System.out.println();
        }
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    posMaior = String.format("[%d][%d]", i, j);
                }
                if(matriz[i][j] < menor) {
                    menor = matriz[i][j];
                    posMenor = String.format("[%d][%d]", i, j);
                }
            }
        }
        System.out.println("O maior elemento encontrado foi " + maior + " na posição " + posMaior);
        System.out.println("O menor elemento encontrado foi " + menor + " na posição " + posMenor);
    }

}
