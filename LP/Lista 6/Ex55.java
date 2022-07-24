import java.util.Scanner;

public class Ex55 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número qualquer: ");
        int numero = sc.nextInt();
        sc.close();
        int acumuladora = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                acumuladora += i;
            }
        }
        if (acumuladora == numero) {
            System.out.println("O número " + numero + " é um número perfeito!");
        } else {
            System.out.println("O número " + numero + " não é um número perfeito!");
        }
    }

}
