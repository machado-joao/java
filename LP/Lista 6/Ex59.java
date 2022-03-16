import java.util.Scanner;

public class Ex59 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o primeiro termo da sequência: ");
        int anterior = sc.nextInt();
        System.out.print("Digite o segundo termo da sequência: ");
        int proximo = sc.nextInt();
        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int ricci;
        for(int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(anterior + " ");
            ricci = anterior + proximo;
            anterior = proximo;
            proximo = ricci;
        }
        System.out.println();    
    }

}
