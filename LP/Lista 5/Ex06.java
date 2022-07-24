import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int valor2 = sc.nextInt();
        sc.close();
        int maior = 0;
        if (valor1 > valor2) {
            maior = valor1;
        } else {
            maior = valor2;
        }
        System.out.println("Maior valor: " + maior);
    }

}
