import java.util.Scanner;

public class Ex21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int quantidadeNumeros = sc.nextInt();
        int acumuladora = 0, maior = 0;
        for(int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            acumuladora += numero;
            if(i == 1) {
                maior = numero;
            }
            if(numero > maior) {
                maior = numero;
            }
        }
        sc.close();
        System.out.println("Maior número lido: " + maior);
        double media = (double) acumuladora / quantidadeNumeros;
        System.out.println("Média dos números lidos: " + media);
    }
    
}
