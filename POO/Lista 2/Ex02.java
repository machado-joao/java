import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        sc.close();
        System.out.println(numero + " é zero? " + (isZero(numero) ? "Sim" : "Não"));
    }

    private static boolean isZero(double numero) {
        if(numero == 0) {
            return true;
        }
        return false;
    }

}
