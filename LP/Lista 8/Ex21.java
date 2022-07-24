public class Ex21 {

    public static void main(String[] args) {
        int n = 10;
        int[] ab;
        ab = Vetor.lerVetor(n);
        System.out.print("Vetor lido: ");
        Vetor.imprimirVetor(ab);
        int quantidadeImpares = Vetor.contarImpares(ab);
        int[] pares = new int[quantidadeImpares];
        int auxiliar = 0;
        for (int i = 0; i < ab.length; i++) {
            if (ab[i] % 2 != 0) {
                pares[auxiliar++] = ab[i] * 2;
            }
        }
        System.out.print("Vetor de pares: ");
        Vetor.imprimirVetor(pares);
    }

}
