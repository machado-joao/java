import java.util.Arrays;

public class Ex31 {
    
    public static void main(String[] args) {
        int n = 0;
        do {
            System.out.print("Digite o tamanho do vetor: ");
            n = Vetor.scanner.nextInt();
            if(n < 1 || n > 10) {
                System.out.println("Digite um valor no intervalo [1, 10]!");
            }
        } while(n < 1 || n > 10);
        String[] am = new String[n];
        for(int i = 0; i < am.length; i++) {
            System.out.printf("[%d] = ", i);
            am[i] = Vetor.scannerStr.nextLine();
        }
        System.out.print("Vetor: ");
        Vetor.imprimirVetor(am);
        Arrays.sort(am);
        System.out.print("Vetor ordenado: ");
        Vetor.imprimirVetor(am);
    }

}
