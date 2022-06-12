import java.io.File;
import java.time.Duration;
import java.time.Instant;

public class MergeSort {

    public static void main(String[] args) {

        // Instanciação da classe que contém os vetores e alguns métodos úteis como
        // cópia e impressão de vetores.
        // Deste modo, o código fica mais organizado e orientado a objetos, conforme a
        // premissa da linguagem Java.
        Vetores merge = new Vetores();

        // Declaração dos objetos que averiguam o tempo corrido durante a execução dos
        // algoritmos de ordenação.
        Instant inicio = null;
        Instant fim = null;
        Duration tempo = null;

        // Cria o arquivo que guardará os tempo de duração do algoritmo.
        File arquivo = merge.criar();
        StringBuilder texto = new StringBuilder();
        System.out.println("O tempo dos algoritmos constam no arquivo " + arquivo.getName());

        // Ordenação de vetores com 100 (cem) elementos.
        int[] A100 = merge.copiar(merge.getA100(), merge.getA100().length);
        int[] A100_AUXILIAR = merge.copiar(merge.getA100(), merge.getA100().length);
        System.out.println("Array antes dos ordenamentos: " + merge.imprimir(A100));

        inicio = Instant.now();
        int[] A100_CRESCENTE = mergeSortCrescente(A100, A100_AUXILIAR, 0, A100.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + merge.imprimir(A100_CRESCENTE));

        // Ordenação de vetores com 1000 (mil) elementos.
        int[] A1000 = merge.copiar(merge.getA1000(), merge.getA1000().length);
        int[] A1000_AUXILIAR = merge.copiar(merge.getA1000(), merge.getA1000().length);
        System.out.println("Array antes dos ordenamentos: " + merge.imprimir(A1000));

        inicio = Instant.now();
        int[] A1000_CRESCENTE = mergeSortCrescente(A1000, A1000_AUXILIAR, 0, A1000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + merge.imprimir(A1000_CRESCENTE));

        // Ordenação de vetores com 10000 (dez mil) elementos.
        int[] A10000 = merge.copiar(merge.getA10000(), merge.getA10000().length);
        int[] A10000_AUXILIAR = merge.copiar(merge.getA10000(), merge.getA10000().length);
        System.out.println("Array antes dos ordenamentos: " + merge.imprimir(A10000));

        inicio = Instant.now();
        int[] A10000_CRESCENTE = mergeSortCrescente(A10000, A10000_AUXILIAR, 0, A10000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + merge.imprimir(A10000_CRESCENTE));

        // Ordenação de vetores com 10000 (dez mil) elementos.
        int[] A100000 = merge.copiar(merge.getA100000(), merge.getA100000().length);
        int[] A100000_AUXILIAR = merge.copiar(merge.getA100000(), merge.getA100000().length);
        System.out.println("Array antes dos ordenamentos: " + merge.imprimir(A100000));

        inicio = Instant.now();
        int[] A100000_CRESCENTE = mergeSortCrescente(A100000, A100000_AUXILIAR, 0, A100000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + merge.imprimir(A100000_CRESCENTE));

        // Ordenação de vetores com 100000 (um milhão) de elementos.
        int[] A1000000 = merge.copiar(merge.getA1000000(), merge.getA1000000().length);
        int[] A1000000_AUXILIAR = merge.copiar(merge.getA1000000(), merge.getA1000000().length);
        System.out.println("Array antes dos ordenamentos: " + merge.imprimir(A100000));

        inicio = Instant.now();
        int[] A1000000_CRESCENTE = mergeSortCrescente(A1000000, A1000000_AUXILIAR, 0, A1000000.length - 1);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + merge.imprimir(A1000000_CRESCENTE));

        // Escreve o conteúdo no arquivo "Tempos.txt".
        merge.escrever(texto.toString());
    }

    public static int[] mergeSortCrescente(int[] vetor, int[] auxiliar, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            mergeSortCrescente(vetor, auxiliar, inicio, meio);
            mergeSortCrescente(vetor, auxiliar, meio + 1, fim);
            merge(vetor, auxiliar, inicio, meio, fim);
        }
        return vetor;
    }

    private static void merge(int[] vetor, int[] auxiliar, int inicio, int meio, int fim) {
        for (int i = inicio; i <= fim; i++) {
            auxiliar[i] = vetor[i];
        }
        int esquerda = inicio;
        int direita = meio + 1;
        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                vetor[i] = auxiliar[direita++];
            } else if (direita > fim) {
                vetor[i] = auxiliar[esquerda++];
            } else if (auxiliar[esquerda] < auxiliar[direita]) {
                vetor[i] = auxiliar[esquerda++];
            } else {
                vetor[i] = auxiliar[direita++];
            }
        }
    }

}
