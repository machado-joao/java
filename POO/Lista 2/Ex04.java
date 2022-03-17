import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double a = 0, b = 0, c = 0;
        do {
            System.out.print("Digite o valor do coeficiente A: ");
            a = sc.nextDouble();
            if(a == 0) {
                System.out.println("O coeficiente A deve ser diferente de zero!");
            }
        } while(a == 0);
        System.out.print("Digite o valor do coeficiente B: ");
        b = sc.nextDouble();
        System.out.print("Digite o valor do coeficiente C: ");
        c = sc.nextDouble();
        sc.close();
        System.out.println("O valor de delta é: " + calcularDelta(a, b, c));
    }

    private static double calcularDelta(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        return delta;
    }

}
