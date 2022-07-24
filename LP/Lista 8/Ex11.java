public class Ex11 {

    public static void main(String[] args) {
        int n = 5;
        int[] qa, qb;
        qa = Vetor.lerVetor(n);
        qb = Vetor.lerVetor(n);
        System.out.print("Vetor 1: ");
        Vetor.imprimirVetor(qa);
        System.out.print("Vetor 2: ");
        Vetor.imprimirVetor(qb);
        int[] qc = new int[n * 2];
        qc = Vetor.intercalarVetores(qa, qb);
        System.out.print("Vetor 3: ");
        Vetor.imprimirVetor(qc);
    }

}
