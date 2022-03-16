public class Ex12 {
    
    public static void main(String[] args) {
        int m = 10, n = 15;
        int[] p, q;
        p = Vetor.lerVetor(m);
        q = Vetor.lerVetor(n);
        System.out.print("Vetor 1: ");
        Vetor.imprimirVetor(p);
        System.out.print("Vetor 2: ");
        Vetor.imprimirVetor(q);
        int[] r = new int[m + n];
        r = Vetor.concatenarVetores(p, q);
        System.out.print("Vetor 3: ");
        Vetor.imprimirVetor(r);
    }

}
