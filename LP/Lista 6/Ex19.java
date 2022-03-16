import java.util.Scanner;

public class Ex19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        int quantidadeMercadoria = 0;
        double valorEmMercadoria = 0;
        char resposta;
        do {
            System.out.print("Digite o valor da mercadoria: ");
            valorEmMercadoria += sc.nextDouble();
            quantidadeMercadoria++;
            System.out.print("Adicionar mais mercadoria? ");
            resposta = scStr.nextLine().toLowerCase().charAt(0);
        } while(resposta == 's');
        sc.close();
        scStr.close();
        System.out.printf("Valor em mercadoria: R$ %.2f\n", valorEmMercadoria);
        double mediaValor = valorEmMercadoria / quantidadeMercadoria;
        System.out.printf("Valor médio das mercadorias: R$ %.2f\n", mediaValor);
    }

}
