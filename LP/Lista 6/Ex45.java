import java.util.Scanner;

public class Ex45 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeTermos = 0;
        do {
            System.out.print("Digite a quantidade de termos: ");
            quantidadeTermos = sc.nextInt();
            if(quantidadeTermos < 1 || quantidadeTermos > 10) {
                System.out.println("Digite uma quantidade de termos entre 1 e 10!");
            }
        } while(quantidadeTermos < 1 || quantidadeTermos > 10);
        sc.close();
        int fatorial;
        for(int i = quantidadeTermos; i >= 1; i--) {
            fatorial = 1;
            for(int j = 1; j <= i; j++) {
                fatorial *= j;
            }
            System.out.printf("%d! = %d\n", i, fatorial);
        }    
    }

}
