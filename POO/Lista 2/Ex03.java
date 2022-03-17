import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        sc.close();
        System.out.printf(numero + " é %s\n", sinal(numero));    
    }

    private static String sinal(double numero) {
        if(numero > 0) {
            return "positivo";
        } else if(numero < 0) {
            return "negativo";
        } else {
            return "zero";
        }
    }

}
