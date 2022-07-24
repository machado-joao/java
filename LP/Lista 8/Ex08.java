public class Ex08 {

    public static void main(String[] args) {
        int[] f;
        f = Vetor.lerVetor(5);
        int contadorImpares = 0;
        for (int i = 0; i < f.length; i++) {
            if (f[i] % 2 != 0) {
                contadorImpares++;
            }
        }
        if (contadorImpares > 0) {
            int somaImpares = 0;
            for (int i = 0; i < f.length; i++) {
                if (f[i] % 2 != 0) {
                    somaImpares += f[i];
                }
            }
            System.out.println("Soma dos elementos ímpares do vetor: " + somaImpares);
        } else {
            System.out.println("O vetor não possui elementos ímpares!");
        }
    }

}
