public class Ex25 {
    
    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        int[] af = new int[n];
        for(int i = 0; i < af.length; i++) {
            System.out.printf("[%d] = ", i);
            af[i] = Vetor.scanner.nextInt();
        }
        int quantidadeImpares = Vetor.contarImpares(af);
        int quantidadePares = Vetor.contarPares(af);
        int[] impares = new int[quantidadeImpares], pares = new int[quantidadePares];
        int impar = 0, par = 0;
        for(int i = 0; i < af.length; i++) {
            if(af[i] % 2 != 0) {
                impares[impar++] = af[i];
            } else {
                pares[par++] = af[i];
            }
        }
        impares = Vetor.ordenarCrescentemente(impares);
        pares = Vetor.ordenarDecrescentemente(pares);
        af = Vetor.concatenarVetores(impares, pares);
        System.out.print("Vetor: ");
        Vetor.imprimirVetor(af);
    }

}
