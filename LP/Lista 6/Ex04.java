import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
