import java.util.Random;
import java.util.Scanner;

public class Ex29 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();
        sc.close();

        int vetor[] = new int[valor], maior = 0;
        Random gerador = new Random();
        System.out.println("Vetor:");
        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(9) + 1;
        }
        for(int i = 0; i < vetor.length; i++) {
            if(i == 0) {
                maior = vetor[i];
            }
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
            System.out.printf("%d ", vetor[i]);
        }
        int matriz[][] = new int[valor][maior + 1];
        for(int i = 0; i < vetor.length; i++) {
            matriz[i][0] = vetor[i];
        }
        System.out.println();
        for(int i = 0; i < matriz.length; i++) {
            matriz[i][0] = vetor[i];

        }
        int primos[] = new int[maior], controladora = 1, numero = 0, totalizadora = 0, posicao = 0;
        for(int i = 1; controladora <= maior; i++) {
            numero = i;
            totalizadora = 0;
            for(int j = 1; j <= numero; j++) {
                if(numero % j == 0) {
                    totalizadora++;
                }
            }
            if(totalizadora == 2) {
                primos[posicao++] = numero;
                controladora++;
            }
        }
        int valorVetor = 0;
        for(int i = 0; i < matriz.length; i++) {
            posicao = 0;
            valorVetor = vetor[i];
            for(int j = 1; j < matriz[i].length; j++) {
                if(j <= valorVetor) {
                    matriz[i][j] = primos[posicao++];
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        System.out.println("Matriz:");
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                if(matriz[i][j] > 0) {
                    System.out.printf("%d ", matriz[i][j]);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }    
    }

}
