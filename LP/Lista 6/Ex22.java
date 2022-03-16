import java.util.Scanner;

public class Ex22 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double acumuladora = 0, maior = 0;
        for(int i = 1; i <= 15; i++) {
            System.out.printf("Digite o preço do produto %d: ", i);
            double precoProduto = sc.nextDouble();
            acumuladora += precoProduto;
            if(i == 1) {
                maior = precoProduto;
            }
            if(precoProduto > maior) {
                maior = precoProduto;
            }
        }
        sc.close();
        System.out.printf("Maior preço digitado: R$ %.2f\n", maior);
        double media = acumuladora / 15;
        System.out.printf("Média dos preços digitados: R$ %.2f\n", media);
    }

}
