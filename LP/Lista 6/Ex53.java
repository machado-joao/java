public class Ex53 {

    public static void main(String[] args) {
        int anterior = 0, proximo = 1, fibonacci;
        while (anterior <= 250) {
            if (anterior >= 1) {
                System.out.print(anterior + " ");
            }
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        System.out.println();
    }

}
