import java.util.Scanner;

public class Ex05 {
    
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
        System.out.println("Raízes:");
        System.out.println(calcularRaizes(a, b, c));
    }

    private static String calcularRaizes(double a, double b, double c) {
        double delta = Math.pow(b, 2) - (4 * a * c);
        if(delta < 0) {
            return String.format("As raízes são complexas!");
        } else {
            double x1 = (-b + (Math.sqrt(delta))) / (2 * a);
            double x2 = (-b - (Math.sqrt(delta))) / (2 * a);
            return String.format("Raíz x\' = %.1f\n" +
                                 "Raíz x\" = %.1f", x1, x2);
        }
    }
    
}
