public class Ex07 {

    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.print("Tamanho do vetor: ");
            n = Vetor.scanner.nextInt();
            if (n < 1 && n > 20) {
                System.out.println("Valor inválido!");
                System.out.println("Entre com um tamanho no intervalo [1, 20]!");
            }
        } while (n < 1 || n > 20);
        int[] e;
        e = Vetor.lerVetor(n);
        Vetor.imprimirVetor(e);
        System.out.print(Vetor.encontrarMaiorMenor(e));
    }

}
