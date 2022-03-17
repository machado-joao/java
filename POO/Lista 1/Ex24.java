import java.util.Scanner;

public class Ex24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int linha = sc.nextInt();
        System.out.print("Digite a quantidade de colunas: ");
        int coluna = sc.nextInt();
        sc.close();

        int matriz[][] = new int[linha][coluna];
        int a = 0, b = 1, c = 0;
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = a;
                System.out.printf("%d ", matriz[i][j]);
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }    
    }

}
