import java.util.Scanner;

public class Ex32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeTermos = 0;
        do {
            System.out.print("Digite a quantidade de termos da sequência: ");
            quantidadeTermos = sc.nextInt();
            if (quantidadeTermos == 0) {
                break;
            }
            if (quantidadeTermos < 0) {
                System.out.println("Digite uma quantidade positiva!");
            }
        } while (quantidadeTermos < 0);
        sc.close();
        for (int i = 0; i <= quantidadeTermos - 1; i++) {
            System.out.print((i * 2) + " ");
        }
        System.out.println();
    }

}
