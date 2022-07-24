import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();
        sc.close();
        if (numero2 < numero1) {
            int auxiliar = numero2;
            numero2 = numero1;
            numero1 = auxiliar;
        }
        int somaIntervalo = 0;
        for (int i = numero1; i <= numero2; i++) {
            somaIntervalo += i;
        }
        System.out.printf("A soma dos números no intervalo [%d,%d] é %d\n", numero1, numero2, somaIntervalo);
    }

}
