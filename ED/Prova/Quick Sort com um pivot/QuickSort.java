import java.io.File;
import java.time.Duration;
import java.time.Instant;

public class QuickSort {

    public static void main(String[] args) {

        // Instanciação da classe que contém os vetores e alguns métodos úteis como
        // cópia e impressão de vetores.
        // Deste modo, o código fica mais organizado e orientado a objetos, conforme a
        // premissa da linguagem Java.
        Vetores quick = new Vetores();

        // Declaração dos objetos que averiguam o tempo corrido durante a execução dos
        // algoritmos de ordenação.
        Instant inicio = null;
        Instant fim = null;
        Duration tempo = null;

        // Cria o arquivo que guardará os tempo de duração do algoritmo.
        File arquivo = quick.criar();
        StringBuilder texto = new StringBuilder();
        System.out.println("O tempo dos algoritmos constam no arquivo " + arquivo.getName());

        // Ordenação de vetores com 100 (cem) elementos.
        int[] A100 = quick.copiar(quick.getA100(), quick.getA100().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A100));

        inicio = Instant.now();
        int[] A100_CRESCENTE = quickSortCrescente(A100, 0, A100.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A100_CRESCENTE));

        // Ordenação de vetores com 1000 (mil) elementos.
        int[] A1000 = quick.copiar(quick.getA1000(), quick.getA1000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A1000));

        inicio = Instant.now();
        int[] A1000_CRESCENTE = quickSortCrescente(A1000, 0, A1000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A1000_CRESCENTE));

        // Ordenação de vetores com 10000 (dez mil) elementos.
        int[] A10000 = quick.copiar(quick.getA10000(), quick.getA10000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A10000));

        inicio = Instant.now();
        int[] A10000_CRESCENTE = quickSortCrescente(A10000, 0, A10000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A10000_CRESCENTE));

        // Ordenação de vetores com 100000 (cem mil) elementos.
        int[] A100000 = quick.copiar(quick.getA100000(), quick.getA100000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A100000));

        inicio = Instant.now();
        int[] A100000_CRESCENTE = quickSortCrescente(A100000, 0, A100000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A100000_CRESCENTE));

        // Ordenação de vetores com 100000 (um milhão) de elementos.
        int[] A1000000 = quick.copiar(quick.getA1000000(), quick.getA1000000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A1000000));

        inicio = Instant.now();
        int[] A1000000_CRESCENTE = quickSortCrescente(A1000000, 0, A1000000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A1000000_CRESCENTE));

        // Escreve o conteúdo no arquivo "Tempos.txt".
        quick.escrever(texto.toString());
    }

    public static int[] quickSortCrescente(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int p = particao(vetor, esquerda, direita);
            quickSortCrescente(vetor, esquerda, p);
            quickSortCrescente(vetor, p + 1, direita);
        }
        return vetor;
    }

    private static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (vetor[i] < pivot);
            do {
                j--;
            } while (vetor[j] > pivot);
            if (i >= j) {
                return j;
            }
            int auxiliar = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = auxiliar;
        }
    }

}
