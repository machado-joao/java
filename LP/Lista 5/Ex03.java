import java.util.Scanner;

public class Ex03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de maçãs compradas: ");
        int quantidade = sc.nextInt();
        sc.close();
        double total = 0;
        if(quantidade >= 12) {
            total = quantidade * 1;
        } else {
            total = quantidade * 1.3;
        }
        System.out.printf("O valor total da compra é R$ %.2f\n", total);
    }

}
