import java.util.Scanner;

public class Ex11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número inteiro: ");
            numero = sc.nextInt();
            if(numero < 1) {
                System.out.println("Digite um número maior ou igual a 1!");
            }
        } while(numero < 1);
        sc.close();

        System.out.println("O número " + numero + " é perfeito? " + (isPerfeito(numero) ? "Sim" : "Não"));
    }

    private static boolean isPerfeito(int numero) {
        boolean isPerfeito = false;
        int soma = 0;
        for(int i = 1; i < numero; i++) {
            if(numero % i == 0) {
                soma += i;
            }
        }
        if(numero == soma) {
            isPerfeito = true;
        }
        return isPerfeito;
    }

}
