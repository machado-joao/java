public class Ex05 {
    
    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.print("Tamanho dos vetores: ");
            n = Vetor.scanner.nextInt();
            if(n < 1 && n > 15) {
                System.out.println("Valor inválido!");
                System.out.println("Entre com um tamanho no intervalo [1, 15]!");
            }
        } while(n < 1 || n > 15);
        int[] vetor1, vetor2;
        vetor1 = Vetor.lerVetor(n);
        vetor2 = Vetor.lerVetor(n);
        int[] vetor3 = Vetor.somarVetores(vetor1, vetor2);
        Vetor.imprimirVetor(vetor3);
    }

}
