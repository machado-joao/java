import java.util.Scanner;

public class Ex24_v2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantidade de linhas: ");
        int linhas = leia.nextInt();
        System.out.print("Quantidade de colunas: ");
        int colunas = leia.nextInt();
        leia.close();

        int[][] matriz = new int[linhas][colunas];

        int anterior = 0, proximo = 1, fibonacci = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = anterior;
                System.out.print(matriz[i][j] + " ");
                fibonacci = anterior + proximo;
                anterior = proximo;
                proximo = fibonacci;
            }
            System.out.println();
        }
    }

}
