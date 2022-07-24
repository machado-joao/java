public class Ex24 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        int[] ae = new int[n];
        for (int i = 0; i < ae.length; i++) {
            int valor;
            do {
                System.out.printf("[%d] = ", i);
                valor = Vetor.scanner.nextInt();
                if (valor % 2 == 0) {
                    System.out.println("Digite valores ímpares!");
                }
            } while (valor % 2 == 0);
            ae[i] = valor;
        }
        System.out.print("Vetor: ");
        Vetor.imprimirVetor(ae);
        System.out.print("Vetor ordenado: ");
        ae = Vetor.ordenarDecrescentemente(ae);
        Vetor.imprimirVetor(ae);
    }

}
