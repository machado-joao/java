public class Ex14 {
    
    public static void main(String[] args) {
        int m = 15, n = 10;
        int[] s, t;
        s = Vetor.lerVetor(n);
        t = Vetor.lerVetor(m);
        System.out.print("Vetor 1: ");
        Vetor.imprimirVetor(s);
        System.out.print("Vetor 2: ");
        Vetor.imprimirVetor(t);
        int[] u = new int[m + n];
        u = Vetor.intercalarVetores(s, t);
        System.out.print("Vetor 3: ");
        Vetor.imprimirVetor(u);
    }

}
