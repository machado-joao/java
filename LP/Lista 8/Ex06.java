public class Ex06 {
    
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
        Vetor.imprimirVetor(vetor1);
        Vetor.imprimirVetor(vetor2);
        System.out.print("Posições onde os elementos são iguais: ");
        for(int i = 0; i < vetor1.length; i++) {
            if(vetor1[i] == vetor2[i]) {
                if(i < vetor1.length - 1) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + "\n");
                }
            }
        }
    }

}
