import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        System.out.println("O número " + numero + " é primo? " + (isPrimo(numero) ? "Sim" : "Não"));
    }

    private static boolean isPrimo(int numero) {
        boolean isPrimo = false;
        int divisiveis = 0;
        for(int j = 1; j <= numero; j++) {
            if(numero % j == 0) {
                divisiveis++;
            }
        }
        if(divisiveis == 2) {
            isPrimo = true;
        }
        return isPrimo;
    }

}
