import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();

        int numeroInvertido = inverterNumero(numero);
        System.out.println("Número invertido: " + numeroInvertido);
    }

    private static int inverterNumero(int numero) {
        String numeroStr = Integer.toString(numero);
        StringBuilder numeroInvertidoStr = new StringBuilder(numeroStr);
        return Integer.parseInt(numeroInvertidoStr.reverse().toString());
    }

}
