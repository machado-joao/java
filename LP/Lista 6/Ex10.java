import java.util.Scanner;

public class Ex10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int acumuladora = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            acumuladora += sc.nextInt();
        }
        sc.close();
        double media = (double) acumuladora / 10;
        System.out.println("Média dos valores digitados: " + media);
    }

}
