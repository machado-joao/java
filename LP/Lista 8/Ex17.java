public class Ex17 {

    public static void main(String[] args) {
        int quantidadeTermos = 0;
        do {
            System.out.print("Quantidade de termos da sequência: ");
            quantidadeTermos = Vetor.scanner.nextInt();
            if (quantidadeTermos < 1 && quantidadeTermos > 20) {
                System.out.println("Entre com uma quantidade de termos no intervalo [1, 20]!");
            }
        } while (quantidadeTermos < 1 || quantidadeTermos > 20);
        int[] x = new int[quantidadeTermos];
        int numero, divisiveis, auxiliar = 0, controladora = 0;
        for (int i = 2; controladora != quantidadeTermos; i++) {
            numero = i;
            divisiveis = 0;
            for (int j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    divisiveis++;
                }
            }
            if (divisiveis == 2) {
                x[auxiliar++] = numero;
                controladora++;
            }
        }
        System.out.print("Vetor com a sequência de primos: ");
        Vetor.imprimirVetor(x);
    }

}
