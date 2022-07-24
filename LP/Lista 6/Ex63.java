import java.util.Scanner;

public class Ex63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int numerador = 0, denominador = 0;
        double somaSequencia = 0;
        // Fibonacci
        int anterior = 0, proximo = 1, fibonacci;
        // Primos
        int numero = 0, divisores = 0, auxiliar = 2;
        boolean encontrouValor = false;
        for (int i = 1; i <= quantidadeTermos; i++) {
            numerador = anterior;
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
            encontrouValor = false;
            for (int j = auxiliar; !encontrouValor; j++) {
                numero = j;
                divisores = 0;
                for (int k = 1; k <= numero; k++) {
                    if (numero % k == 0) {
                        divisores++;
                        auxiliar = j + 1;
                    }
                }
                if (divisores == 2) {
                    denominador = numero;
                    encontrouValor = true;
                }
            }
            System.out.print(numerador + "/" + denominador + " ");
            somaSequencia += (double) numerador / denominador;
        }
        System.out.printf("\nO valor final da sequência é %.3f\n", somaSequencia);
    }

}
