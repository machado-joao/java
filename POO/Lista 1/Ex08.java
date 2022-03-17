import java.util.Random;

public class Ex08 {
    
    public static void main(String[] args) {
        int n = 5;
        int matriz[][] = new int[n][n];
        Random gerador = new Random();
        int contadorPares = 0, contadorImpares = 0;
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                System.out.printf("%d ", matriz[i][j]);
                if(matriz[i][j] % 2 == 0) {
                    contadorPares++;
                } else {
                    contadorImpares++;
                }
            }
            System.out.println();
        }
        int[] pares = new int[contadorPares];
        int[] impares = new int[contadorImpares];
        int auxiliarPar = 0, auxiliarImpar = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] % 2 == 0) {
                    pares[auxiliarPar++] = matriz[i][j];
                } else {
                    impares[auxiliarImpar++] = matriz[i][j];
                }
            }
        }
        System.out.println("Vetor de pares:");
        for (int i : pares) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println("Vetor de ímpares:");
        for (int i : impares) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

}
