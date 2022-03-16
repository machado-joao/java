public class Buscas {
    /* Este algoritmo faz uma busca linear, sendo assim, sua complexidade é O(N) */
    public static boolean buscaLinear(int[] vetor, int elemento) {
        boolean existe = false;
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == elemento) {
                existe = true;
                break;
            }
        }
        return existe;
    }

    /* Este algorito faz uma busca binária, sendo assim, sua complexidade é O(log n),
       mas vale ressaltar que para a sua utlização os elementos devem estar ordenados */
    public static boolean buscaBinaria(int[] vetor, int elemento) {
        boolean existe = false;
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        while(inicio <= fim) {
            meio = (int) ((inicio + fim) / 2);
            if(vetor[meio] == elemento) {
                existe = true;
                break;
            } else if(vetor[meio] < elemento) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return existe;
    }
}
