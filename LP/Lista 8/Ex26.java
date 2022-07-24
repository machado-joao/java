public class Ex26 {

    public static void main(String[] args) {
        int n = (int) (Math.random() * 10 + 1);
        int[] ag = new int[n];
        for (int i = 0; i < ag.length; i++) {
            System.out.printf("[%d] = ", i);
            ag[i] = Vetor.scanner.nextInt();
        }
        System.out.print("Vetor: ");
        Vetor.imprimirVetor(ag);
        int contadorPrimos = 0, numero, divisiveis;
        for (int i = 0; i < ag.length; i++) {
            numero = ag[i];
            divisiveis = 0;
            for (int j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    divisiveis++;
                }
            }
            if (divisiveis == 2) {
                contadorPrimos++;
            }
        }
        int[] primos = new int[contadorPrimos], outros = new int[ag.length - contadorPrimos];
        int auxiliarPrimos = 0, auxiliarOutros = 0;
        for (int i = 0; i < ag.length; i++) {
            numero = ag[i];
            divisiveis = 0;
            for (int j = 1; j <= numero; j++) {
                if (numero % j == 0) {
                    divisiveis++;
                }
            }
            if (divisiveis == 2) {
                primos[auxiliarPrimos++] = numero;
            } else {
                outros[auxiliarOutros++] = numero;
            }
        }
        primos = Vetor.ordenarCrescentemente(primos);
        ag = Vetor.concatenarVetores(primos, outros);
        System.out.print("Vetor ordenado: ");
        Vetor.imprimirVetor(ag);
    }

}
