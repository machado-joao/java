import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        if (numero > 10) {
            System.out.println("O número " + numero + " é maior que 10!");
        } else {
            System.out.println("O número " + numero + " não é maior que 10!");
        }
    }

}
