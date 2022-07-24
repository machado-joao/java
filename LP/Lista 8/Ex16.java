public class Ex16 {

    public static void main(String[] args) {
        int quantidadeTermos = 0;
        do {
            System.out.print("Quantidade de termos da sequência: ");
            quantidadeTermos = Vetor.scanner.nextInt();
            if (quantidadeTermos < 1 && quantidadeTermos > 20) {
                System.out.println("Entre com uma quantidade de termos no intervalo [1, 20]!");
            }
        } while (quantidadeTermos < 1 || quantidadeTermos > 20);
        int[] v = new int[quantidadeTermos];
        int anterior = 0, proximo = 1, fibonacci;
        for (int i = 0; i < v.length; i++) {
            v[i] = anterior;
            fibonacci = anterior + proximo;
            anterior = proximo;
            proximo = fibonacci;
        }
        System.out.print("Vetor com a sequência de Fibonacci: ");
        Vetor.imprimirVetor(v);
    }

}
