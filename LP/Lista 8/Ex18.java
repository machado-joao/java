public class Ex18 {

    public static void main(String[] args) {
        int quantidadeTermos = 0;
        do {
            System.out.print("Quantidade de termos da sequência: ");
            quantidadeTermos = Vetor.scanner.nextInt();
            if (quantidadeTermos < 1 && quantidadeTermos > 15) {
                System.out.println("Entre com uma quantidade de termos no intervalo [1, 15]!");
            }
        } while (quantidadeTermos < 1 || quantidadeTermos > 15);
        int[] y = new int[quantidadeTermos];
        int numero, fatorial, auxiliar = 0;
        for (int i = 1; i <= quantidadeTermos; i++) {
            numero = i;
            fatorial = 1;
            for (int j = numero; j >= 1; j--) {
                fatorial *= j;
            }
            y[auxiliar++] = fatorial;
        }
        System.out.print("Vetor com a sequência de fatoriais: ");
        Vetor.imprimirVetor(y);
    }

}
