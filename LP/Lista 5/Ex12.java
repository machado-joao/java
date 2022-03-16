import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double precoProduto = sc.nextDouble();
        System.out.print("Digite o código do produto: ");
        int codigoProduto = sc.nextInt();
        sc.close();

        StringBuilder regiao = new StringBuilder();
        double frete = 0;
        if(codigoProduto == 1) {
            regiao.append("Norte");
            frete = 0.1;
        } else if(codigoProduto == 2 || codigoProduto == 5 || codigoProduto == 9) {
            regiao.append("Sul");
            frete = 0.03;
        } else if(codigoProduto == 3 || (codigoProduto >= 10 && codigoProduto <= 15)) {
            regiao.append("Leste");
            frete = 0.012;
        } else if(codigoProduto == 7 || codigoProduto == 20) {
            regiao.append("Oeste");
            frete = 0.073;
        } else {
            regiao.append("Importado");
            frete = 0.222;
        }
        double valorFrete = precoProduto * frete;
        double valorTotal = precoProduto + valorFrete;
        System.out.printf("Preço do produto: R$ %.2f\n" +
                          "Região de procedência: %s\n" +
                          "Taxa do frete: %.1f%%\n" +
                          "Valor total: R$ %.2f\n", precoProduto, regiao, frete * 100, valorTotal);
    }

}
