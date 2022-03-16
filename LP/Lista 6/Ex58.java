import java.util.Scanner;

public class Ex58 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro termo da sequência: ");
        int anterior = sc.nextInt();
        System.out.print("Digite o segundo termo da sequência: ");
        int proximo = sc.nextInt();
        sc.close();
        int ricci;
        for(int i = 1; i <= 10; i++) {
            System.out.print(anterior + " ");
            ricci = anterior + proximo;
            anterior = proximo;
            proximo = ricci;
        }
        System.out.println();
    }

}
