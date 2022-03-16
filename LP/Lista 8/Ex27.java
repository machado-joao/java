public class Ex27 {
    
    public static void main(String[] args) {
        int n = 10, m = 5;
        int[] ah = new int[(int) (Math.random() * n + 1)];
        int[] ai = new int[(int) (Math.random() * m + 1)];
        ah = Vetor.preencherVetor(ah, n);
        ai = Vetor.preencherVetor(ai, n);
        System.out.print("Vetor 1: ");
        Vetor.imprimirVetor(ah);
        System.out.print("Vetor 2: ");
        Vetor.imprimirVetor(ai);
        System.out.print("Vetores concatenados: ");
        Vetor.imprimirVetor(Vetor.concatenarVetores(ah, ai));
    }

}
