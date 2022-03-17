import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        do {
            System.out.print("Digite a quantidade de números: ");
            quantidade = sc.nextInt();
            if(quantidade < 1) {
                System.out.println("Digite um valor maior ou igual a 1!");
            }
        } while(quantidade < 1);

        int numeros[] = new int[quantidade];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "° número: ");
            numeros[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("O MMC entre os números digitados é " + mmc(numeros));
    }

    private static int mmc(int numero1, int numero2) {
        int n = 2, resultado = 1;
        while(numero1 != 1 || numero2 != 1) {
            while(numero1 % n != 0 && numero2 % n != 0) {
                n++;
            }
            if(numero1 % n == 0) {
                numero1 = numero1 / n;
            }
            if(numero2 % n == 0) {
                numero2 = numero2 / n;
            }
            resultado *= n;
        }
        return resultado;
    }

    private static int mmc(int[] numeros) {
        int resultado = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            resultado = mmc(resultado, numeros[i]);
        }
        return resultado;
    }

}
