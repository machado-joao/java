public class Ex03 {

    public static void main(String[] args) {
        double precoProduto1 = Math.random() * 1000;
        double precoProduto2 = Math.random() * 1000;
        System.out.printf("Preço do produto 1: R$ %.2f\n", precoProduto1);
        System.out.printf("Preço do produto 2: R$ %.2f\n", precoProduto2);
        if (precoProduto1 < precoProduto2) {
            System.out.println("O produto 1 é o mais barato!");
        } else if (precoProduto2 < precoProduto1) {
            System.out.println("O produto 2 é o mais barato!");
        } else {
            System.out.println("Os preços são iguais!");
            ;
        }
    }

}
