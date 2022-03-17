import java.util.Random;
import java.util.Scanner;

public class Ex07 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        char continuar = 's';
        int contador = 0, valor = 0;
        while(continuar == 's') {
            if(contador == 0) {
                valor = dado();
                contador++;
            } else {
                System.out.print("Deseja jogar novamente [s/n]? ");
                continuar = scStr.nextLine().toLowerCase().charAt(0);
                valor = dado();
            }
            System.out.println("Saiu: " + valor);
        }
        sc.close();
        scStr.close();    
    }

    private static int dado() {
        Random dado = new Random();
        return (dado.nextInt(6) + 1);
    }

}
