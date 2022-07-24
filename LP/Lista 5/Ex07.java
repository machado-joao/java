import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = sc.nextInt();
        sc.close();
        if (valor1 > valor2) {
            int auxiliar = valor1;
            valor1 = valor2;
            valor2 = auxiliar;
        }
        System.out.println("Ordem crescente: " + valor1 + ", " + valor2);
    }

}
