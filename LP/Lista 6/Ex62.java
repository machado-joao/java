import java.util.Scanner;

public class Ex62 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int numerador = 2, denominador = 1;
        double somaSequencia = 0;
        for (int i = 1; i <= quantidadeTermos; i++) {
            if (i % 2 != 0) {
                somaSequencia += (double) numerador / denominador;
                System.out.print(numerador + "/" + denominador + " ");
            } else {
                somaSequencia -= (double) numerador / denominador;
                System.out.print("-" + numerador + "/" + denominador + " ");
            }
            numerador += 2;
            denominador += 2;
        }
        System.out.printf("\nO valor final da sequência é %.3f\n", somaSequencia);
    }

}
