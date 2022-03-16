public class Ex03 {

    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.print("Tamanho do vetor: ");
            n = Vetor.scanner.nextInt();
            if(n < 1 && n > 20) {
                System.out.println("Entre com um tamanho no intervalo [1, 20]!");
            }
        } while(n < 1 || n > 20);
        int[] c;
        c = Vetor.lerVetor(n);
        Vetor.imprimirVetor(c);
    }

}
