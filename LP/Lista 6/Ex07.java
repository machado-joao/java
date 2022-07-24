import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero < 1 || numero > 10) {
                System.out.println("O número deve estar entre 1 e 10!");
            }
        } while (numero < 1 || numero > 10);
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", numero, i, numero * i);
        }
    }

}
