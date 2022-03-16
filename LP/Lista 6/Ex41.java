import java.util.Scanner;

public class Ex41 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        int fatorial = 1;
        if(numero != 0) {
            for(int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
        }
        System.out.printf("%d! = %d\n", numero, fatorial);
    }

}
