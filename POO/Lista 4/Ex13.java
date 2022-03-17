import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidade = sc.nextInt();
        int numeros[] = new int[quantidade], perfeitos[];
        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Digite  o " + (i +  1) + "° número: ");
            numeros[i] = sc.nextInt();
        }
        sc.close();

        perfeitos = perfeitos(numeros);
        for(int i = 0; i < perfeitos.length; i++) {
            if(perfeitos[i] > 0) {
                System.out.print(perfeitos[i] + " ");
            }
        }
        System.out.println();
    }

    private static int[] perfeitos(int[] numeros) {
        int numero, soma = 0, perfeitos[] = new int[numeros.length];
        for(int i = 0; i < numeros.length; i++) {
            numero = numeros[i];
            soma = 0;
            for(int j = 1; j < numero; j++) {
                if(numero % j == 0) {
                    soma += j;
                }
            }
            if(numero == soma) {
                perfeitos[i] = numeros[i];
            }
        }
        return perfeitos;
    }

}
