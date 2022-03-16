import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorNegativos = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            if(numero < 0) {
                contadorNegativos++;
            }
        }
        sc.close();
        System.out.println("Quantidade de números negativos digitados: " + contadorNegativos);
    }

}
