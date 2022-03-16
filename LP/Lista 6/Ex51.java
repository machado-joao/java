import java.util.Scanner;

public class Ex51 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int anterior = 0, proximo = 1, fibonacci;
        for(int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(anterior + " ");
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        System.out.println();
    }

}
