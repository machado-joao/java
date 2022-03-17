import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if(numero < 1) {
                System.out.println("Digite um número maior ou igual a 1!");
            }
        } while(numero < 1);
        sc.close();

        System.out.println("Sequência de números perfeitos até o valor informado: " + perfeitos(numero));
    }

    private static String perfeitos(int numero) {
        String sequencia = "";
        int valor, soma;
        for(int i = 1; i <= numero; i++) {
            valor = i;
            soma = 0;
            for(int j = 1; j < valor; j++) {
                if(valor % j == 0) {
                    soma += j;
                }
            }
            if(valor == soma) {
                sequencia += valor + " ";
            }
        }
        return sequencia;
    }

}
