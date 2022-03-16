import java.util.Scanner;

public class Ex09 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorIntervalo = 0;
        for(int i = 1; i <= 10; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            if(numero >= 10 && numero <= 20) {
                contadorIntervalo++;
            }
        }
        sc.close();
        System.out.println("Quantidade de números no intervalo [10, 20] digitados: " + contadorIntervalo);
    }

}
