import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        if (numero >= 0) {
            System.out.println("O número " + numero + " é positivo!");
        } else {
            System.out.println("O número " + numero + " é negativo!");
        }
    }

}
