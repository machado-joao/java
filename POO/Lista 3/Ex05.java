import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();
        System.out.print("Digite o último número: ");
        int numero3 = sc.nextInt();
        sc.close();
        System.out.println("Maior valor entre os dois primeiros: " + maior(numero1, numero2));
        System.out.println("Maior valor entre todos: " + maior(numero1, numero2, numero3));
    }

    private static int maior(int numero1, int numero2) {
        if(numero1 >= numero2) {
            return numero1;
        }
        return numero2;
    }   

    private static int maior(int numero1, int numero2, int numero3) {
        if(numero1 > numero2 && numero1 > numero3) {
            return numero1;
        } else if(numero2 > numero1 && numero2 > numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }

}
