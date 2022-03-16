import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            soma += sc.nextInt();
        }
        sc.close();
        System.out.println("A soma dos números digitados é: " + soma);
    }

}
