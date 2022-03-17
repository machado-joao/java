import java.util.Random;
import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;
        do {
            System.out.print("Digite a quantidade de linhas da matriz: ");
            linha = sc.nextInt();
            if(linha < 1) {
                System.out.println("A matriz deve possuir ao menos 1 linha!");
            }
        } while(linha < 1);
        do {
            System.out.print("Digite a quantidade de colunas da matriz: ");
            coluna = sc.nextInt();
            if(coluna < 1) {
                System.out.println("A matriz deve possuir ao menos 1 coluna!");
            }
        } while(coluna < 1);
        System.out.print("Digite o valor máximo a ser gerado: ");
        int valorMaximo = sc.nextInt();
        sc.close();

        int d[][] = new int[linha][coluna];
        Random gerador = new Random();
        System.out.println("Matriz:");
        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d[i].length; j++) {
                d[i][j] = gerador.nextInt(valorMaximo) + 1;
                System.out.printf("%d ", d[i][j]);
            }
            System.out.println();
        }
    }

}
