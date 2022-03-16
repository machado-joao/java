import java.util.Scanner;

public class Ex13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int somaMenoresQue40 = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            if(numero < 40) {
                somaMenoresQue40 += numero;
            }
        }
        sc.close();
        System.out.println("Soma dos números menores que quarenta digitados: " + somaMenoresQue40);
    }

}
