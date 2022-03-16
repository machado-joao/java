import java.util.Scanner;

public class Ex04 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o preço do produto 1: R$ ");
        double precoProduto1 = sc.nextDouble();
        System.out.print("Digite o preço do produto 2: R$ ");
        double precoProduto2 = sc.nextDouble();
        sc.close();
        if((precoProduto1 < 0) || (precoProduto1 > 1000) || (precoProduto2 < 0) || (precoProduto2 > 1000)) {
            System.out.println("Valor inválido!");
        } else if(precoProduto1 < precoProduto2) {
            System.out.println("O produto 1 é o mais barato!");
        } else if(precoProduto2 < precoProduto1) {
            System.out.println("O produto 2 é o mais barato!");
        } else {
            System.out.println("Os preços são iguais!");
        }
    }

}
