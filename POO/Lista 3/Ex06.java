import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        char continuar = ' ';
        int contador = 0, menor = 0;
        do {
            System.out.print("Digite um número: ");
            int numero = sc.nextInt();
            if(contador == 0) {
                menor = numero;
                contador++;
            } else {
                menor = menor(menor, numero);
            }
            System.out.print("Deseja continuar [s/n]? ");
            continuar = scStr.nextLine().toLowerCase().charAt(0);
        } while(continuar == 's');
        sc.close();
        scStr.close();
        System.out.println("Menor valor: " + menor);
    }

    private static int menor(int menorAtual, int numeroAdicionado) {
        return Math.min(menorAtual, numeroAdicionado);
    }

}
