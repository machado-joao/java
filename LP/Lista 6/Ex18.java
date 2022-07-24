import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de mercadoria em estoque: ");
        int quantidadeMercadoria = sc.nextInt();
        double valorEmMercadoria = 0;
        for (int i = 1; i <= quantidadeMercadoria; i++) {
            System.out.printf("Digite o valor da mercadoria %d: ", i);
            valorEmMercadoria += sc.nextDouble();
        }
        sc.close();
        System.out.printf("Valor em mercadoria: R$ %.2f\n", valorEmMercadoria);
        double mediaValor = valorEmMercadoria / quantidadeMercadoria;
        System.out.printf("Valor médio das mercadorias: R$ %.2f\n", mediaValor);
    }

}
