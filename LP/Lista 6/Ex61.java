import java.util.Scanner;

public class Ex61 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int numerador = 2, denominador = 1;
        double somaSequencia = 0;
        for (int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            somaSequencia += (double) numerador / denominador;
            numerador += 2;
            denominador += 2;
        }
        System.out.printf("\nO valor final da sequência é %.3f\n", somaSequencia);
    }

}
