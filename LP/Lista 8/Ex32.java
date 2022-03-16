import java.util.Arrays;

public class Ex32 {
    
    public static void main(String[] args) {
        System.out.print("Digite uma frase: ");
        String frase = Vetor.scannerStr.nextLine();
        String[] an = frase.split(" ");
        System.out.print("Vetor: ");
        Vetor.imprimirVetor(an);
        Arrays.sort(an);
        System.out.print("Vetor ordenado: ");
        Vetor.imprimirVetor(an);
    }

}
