public class Ex10 {
    
    public static void main(String[] args) {
        int n = 5;
        int[] pa, pb;
        pa = Vetor.lerVetor(n);
        pb = Vetor.lerVetor(n);
        System.out.print("Vetor 1: ");
        Vetor.imprimirVetor(pa);
        System.out.print("Vetor 2: ");
        Vetor.imprimirVetor(pb);
        int[] pc = new int[n * 2];
        pc = Vetor.concatenarVetores(pa, pb);
        System.out.print("Vetor 3: ");
        Vetor.imprimirVetor(pc);
    }

}
