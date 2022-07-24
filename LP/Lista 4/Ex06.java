import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do dividendo: ");
        int dividendo = sc.nextInt();
        System.out.print("Digite o valor do divisor: ");
        int divisor = sc.nextInt();
        sc.close();
        if ((dividendo < 0) || (dividendo > 1000) || (divisor < 0) || (divisor > 20)) {
            System.out.println("Valor inválido!");
        } else if (dividendo % divisor == 0) {
            System.out.println("O número " + dividendo + " é divisível por " + divisor);
        } else {
            System.out.println("O número " + dividendo + " não é divisível por " + divisor);
        }
    }

}
