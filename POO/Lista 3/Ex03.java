import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();
        sc.close();
        System.out.println("Maior valor: " + maior(numero1, numero2));
    }

    private static int maior(int numero1, int numero2) {
        return Math.max(numero1, numero2);
    }

}
