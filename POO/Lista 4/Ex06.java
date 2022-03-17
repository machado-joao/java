import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int inicio = sc.nextInt();
        System.out.print("Digite outro valor: ");
        int fim = sc.nextInt();
        sc.close();

        if(fim < inicio) {
            int auxiliar = inicio;
            inicio = fim;
            fim = auxiliar;
        }
        int quantidadePrimos = contarPrimos(inicio, fim);
        int[] primos = new int[quantidadePrimos];
        primos = primos(inicio, fim, primos);
        System.out.printf("Primos entre %d e %d:\n", inicio, fim);
        for(int i = 0; i < primos.length; i++) {
            System.out.printf("%d ", primos[i]);
        }
        System.out.println();
    }

    private static int contarPrimos(int inicio, int fim) {
        int numero, divisiveis, contador = 0;
        for(int i = inicio; i <= fim; i++) {
            numero = i;
            divisiveis = 0;
            for(int j = 1; j <= numero; j++) {
                if(numero % j == 0) {
                    divisiveis++;
                }
            }
            if(divisiveis == 2) {
                contador++;
            }
        }
        return contador;
    }

    private static int[] primos(int inicio, int fim, int[] primos) {
        int numero, divisiveis, posicao = 0;
        for(int i = inicio; i <= fim; i++) {
            numero = i;
            divisiveis = 0;
            for(int j = 1; j <= numero; j++) {
                if(numero % j == 0) {
                    divisiveis++;
                }
            }
            if(divisiveis == 2) {
                primos[posicao++] = numero;
            }
        }
        return primos;
    }

}
