public class Ex09 {

    public static void main(String[] args) {
        int[] g;
        g = Vetor.lerVetor(5);
        Vetor.imprimirVetor(g);
        int contadorPares = 0;
        for (int i = 0; i < g.length; i++) {
            if (g[i] % 2 == 0) {
                contadorPares++;
            }
        }
        if (contadorPares > 0) {
            int[] h = new int[contadorPares];
            int auxiliar = 0;
            for (int i = 0; i < g.length; i++) {
                if (g[i] % 2 == 0) {
                    h[auxiliar++] = g[i];
                }
            }
            System.out.print("Vetor de pares: ");
            Vetor.imprimirVetor(h);
        } else {
            System.out.println("O vetor não possui elementos pares!");
        }
    }

}
