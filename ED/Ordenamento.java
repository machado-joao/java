public class Ordenamento {
    /* Complexidades:
       Pior caso: O(n²)
       Médio caso: O(n²) 
       Melhor caso: O(n) */
    public static int[] bubbleSort(int[] vetor) {
        int auxiliar;
        for(int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[i] > vetor[j]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }
        return vetor;
    }

    /* Complexidades:
       Pior caso: O(n²)
       Médio caso: O(n²) 
       Melhor caso: O(n) */
    public static int[] insertionSort(int[] vetor) {
        int j, auxiliar;
        for(int i = 1; i < vetor.length; i++) {
            auxiliar = vetor[i];
            j = i - 1;
            while(j >= 0 && vetor[j] > auxiliar) {
                if(vetor[j] > auxiliar) {
                    vetor[j+1] = vetor[j];
                    j--;
                }
            }
            vetor[j+1] = auxiliar;
        }
        return vetor;
    }

    /* Complexidades:
       Pior caso: O(n²)
       Médio caso: O(n²) 
       Melhor caso: O(n²) */
    public static int[] selectionSort(int[] vetor) {
        int posicaoMenor, auxiliar;
        for(int i = 0; i < vetor.length; i++) {
            posicaoMenor = i;
            for(int j = i + 1; j < vetor.length; j++) {
                if(vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            auxiliar = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = auxiliar;
        }
        return vetor;
    }

    /* Complexidades:
       Pior caso: O(n²)
       Médio caso: O(n²) 
       Melhor caso: O(n) */
    public static int[] shellSort(int[] vetor) {
        int h = 1;
        int n = vetor.length;
        while(h < n) {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);
        int elemento, j;
        while(h > 0) {
            for(int i = h; i < n; i++) {
                elemento = vetor[i];
                j = i;
                while(j >= h && vetor[j-h] > elemento) {
                    vetor[j] = vetor[j-h];
                    j = j - h;
                }
                vetor[j] = elemento;
            }
            h = h / 2;
        }
        return vetor;
    }

    /* Complexidades:
       Pior caso: O(n²)
       Médio caso: O(n log₂ n)
       Melhor caso: O(n log₂ n) */
    public static int[] mergeSort(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if(inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSort(vetor, auxiliar, inicio, meio); // Parte esquerda
            mergeSort(vetor, auxiliar, meio + 1, fim); // Parte direita
            merge(vetor, auxiliar, inicio, meio, fim);
        }
        return vetor;
    }

    private static void merge(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for(int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }
        int esquerda = inicio;
        int direita = meio + 1;
        for(int i = inicio; i <= fim; i++) {
            if(esquerda > meio) {
                vetor[i] = auxiliar[direita++];
            } else if(direita > fim) {
                vetor[i] = auxiliar[esquerda++];
            } else if(auxiliar[esquerda] < auxiliar[direita]) {
                vetor[i] = auxiliar[esquerda++];
            } else {
                vetor[i] = auxiliar[direita++];
            }
        }
    }

    /* Complexidades:
       Pior caso: O(n log₂ n)
       Médio caso: O(n log₂ n)
       Melhor caso: O(n log₂ n) */
    public static int[] heapSort(int[] vetor) {
        int n = vetor.length;
        for(int i = n / 2 - 1; i >= 0; i--) {
            heap(vetor, n, i);
        }
        for(int i = n - 1; i > 0; i--) {
            int auxiliar = vetor[0];
            vetor[0] = i;
            vetor[i] = auxiliar;
            heap(vetor, i, 0);
        }    
        return vetor;
    }

    private static void heap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;
        if(esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
        }
        if(direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
        }
        if(raiz != i) {
            int auxiliar = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = auxiliar;
            heap(vetor, n, raiz);
        }
    }

    /* Complexidades:
       Pior caso: O(n²)
       Médio caso: O(n log₂ n)
       Melhor caso: O(n log₂ n) */
    public static int[] quickSort(int[] vetor, int esquerda, int direita) {
        if(esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quickSort(vetor, esquerda, p);
            quickSort(vetor, p + 1, direita);
        }
        return vetor;
    }

    private static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true) {
            do {
                i++;
            } while(vetor[i] < pivot);
            do {
                j--;
            } while(vetor[j] > pivot);
            if(i >= j) {
                return j;
            }
            int auxiliar = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = auxiliar;
        }
    }
}
