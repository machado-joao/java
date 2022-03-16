public class Ex15 {
    
    public static void main(String[] args) {
        int m = (int) (Math.random() * 10 + 1), n = (int) (Math.random() * 15 + 1);
        int[] s, t;
        s = Vetor.lerVetor(m);
        t = Vetor.lerVetor(n);
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
