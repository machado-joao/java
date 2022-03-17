import java.util.Scanner;

public class Ex02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();
        sc.close();
        System.out.println("Menor valor: " + menor(numero1, numero2));
    }

    private static int menor(int numero1, int numero2) {
        if(numero1 <= numero2) {
            return numero1;
        }
        return numero2;
    }

}
