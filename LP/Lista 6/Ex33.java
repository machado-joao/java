import java.util.Scanner;

public class Ex33 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeTermos = 0;
        do {
            System.out.print("Digite a quantidade de termos da sequência: ");
            quantidadeTermos = sc.nextInt();
            if(quantidadeTermos == 0) {
                break;
            }
            if(quantidadeTermos < 0) {
                System.out.println("Digite uma quantidade positiva!");
            }
        } while(quantidadeTermos < 0);
        sc.close();
        int auxiliar = 1;
        for(int i = 1; i <= quantidadeTermos; i++) {
            if(i == 1) {
                System.out.print(auxiliar + " ");
            } else {
                System.out.print(auxiliar + " ");
            }
            auxiliar += 2;
        }
        System.out.println();
    }

}
