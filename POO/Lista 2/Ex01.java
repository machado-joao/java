import java.util.Scanner;

public class Ex01 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = sc.nextDouble();
        sc.close();
        System.out.println(numero + " é positivo? " + (isPositivo(numero) ? "Sim" : "Não"));
    }

    private static boolean isPositivo(double numero) {
        if(numero >= 0) {
            return true;
        }
        return false;
    }

}
