import java.util.Random;
import java.util.Scanner;

public class Ex06 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int linha = sc.nextInt();
        System.out.print("Digite a quantidade de colunas da matriz: ");
        int coluna = sc.nextInt();
        System.out.print("Digite um valor para verificar se existe na matriz: ");
        int valor = sc.nextInt();
        sc.close();

        int matriz[][] = new int[linha][coluna], contador = 0;
        String posicoes = "";
        Random gerador = new Random();
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(25);
                System.out.printf("%d ", matriz[i][j]);
                if(matriz[i][j] == valor) {
                    posicoes += String.format("[%d][%d] ", i, j);
                    contador++;
                }
            }
            System.out.println();
        }
        System.out.println("Posições onde o valor " + valor + " foi encontrado: " + posicoes);
        System.out.println("Quantidade de ocorrências do valor " + valor + " na matriz: " + contador);
    }
    
}
