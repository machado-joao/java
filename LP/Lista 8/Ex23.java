public class Ex23 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        int[] ad = new int[n];
        for (int i = 0; i < ad.length; i++) {
            int valor;
            do {
                System.out.printf("[%d] = ", i);
                valor = Vetor.scanner.nextInt();
                if (valor % 2 != 0) {
                    System.out.println("Digite valores pares!");
                }
            } while (valor % 2 != 0);
            ad[i] = valor;
        }
        System.out.print("Vetor: ");
        Vetor.imprimirVetor(ad);
        System.out.print("Vetor ordenado: ");
        ad = Vetor.ordenarCrescentemente(ad);
        Vetor.imprimirVetor(ad);
    }

}
