import java.util.Scanner;

public class Ex05 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if(numero <= 0) {
                System.out.println("O número deve ser maior que zero!");
            }
        } while(numero <= 0);
        sc.close();
        for(int i = 1; i <= numero; i++) {
            System.out.print(i + " ");
        }
        System.out.println();    
    }

}
