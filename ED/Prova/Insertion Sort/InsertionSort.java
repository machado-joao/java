import java.io.File;
import java.time.Duration;
import java.time.Instant;

public class InsertionSort {

    public static void main(String[] args) {

        // Instanciação da classe que contém os vetores e alguns métodos úteis como
        // cópia e impressão de vetores.
        // Deste modo, o código fica mais organizado e orientado a objetos, conforme a
        // premissa da linguagem Java.
        Vetores insertion = new Vetores();

        // Declaração dos objetos que averiguam o tempo corrido durante a execução dos
        // algoritmos de ordenação.
        Instant inicio = null;
        Instant fim = null;
        Duration tempo = null;

        // Cria o arquivo que guardará os tempo de duração do algoritmo.
        File arquivo = insertion.criar();
        StringBuilder texto = new StringBuilder();
        System.out.println("O tempo dos algoritmos constam no arquivo " + arquivo.getName());

        // Ordenação de vetores com 100 (cem) elementos.
        int[] A100 = insertion.copiar(insertion.getA100(), insertion.getA100().length);
        System.out.println("Array antes dos ordenamentos: " + insertion.imprimir(A100));

        inicio = Instant.now();
        int[] A100_CRESCENTE = insertionSortCrescente(A100);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + insertion.imprimir(A100_CRESCENTE));

        inicio = Instant.now();
        int[] A100_DECRESCENTE = insertionSortDecrescente(A100);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + insertion.imprimir(A100_DECRESCENTE));

        // Ordenação de vetores com 1000 (mil) elementos.
        int[] A1000 = insertion.copiar(insertion.getA1000(), insertion.getA1000().length);
        System.out.println("Array antes dos ordenamentos: " + insertion.imprimir(A1000));

        inicio = Instant.now();
        int[] A1000_CRESCENTE = insertionSortCrescente(A1000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + insertion.imprimir(A1000_CRESCENTE));

        inicio = Instant.now();
        int[] A1000_DECRESCENTE = insertionSortDecrescente(A1000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + insertion.imprimir(A1000_DECRESCENTE));

        // Ordenação de vetores com 10000 (dez mil) elementos.
        int[] A10000 = insertion.copiar(insertion.getA10000(), insertion.getA10000().length);
        System.out.println("Array antes dos ordenamentos: " + insertion.imprimir(A10000));

        inicio = Instant.now();
        int[] A10000_CRESCENTE = insertionSortCrescente(A10000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + insertion.imprimir(A10000_CRESCENTE));

        inicio = Instant.now();
        int[] A10000_DECRESCENTE = insertionSortDecrescente(A10000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + insertion.imprimir(A10000_DECRESCENTE));

        // Ordenação de vetores com 100000 (cem mil) elementos.
        int[] A100000 = insertion.copiar(insertion.getA100000(), insertion.getA100000().length);
        System.out.println("Array antes dos ordenamentos: " + insertion.imprimir(A100000));

        inicio = Instant.now();
        int[] A100000_CRESCENTE = insertionSortCrescente(A100000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + insertion.imprimir(A100000_CRESCENTE));

        inicio = Instant.now();
        int[] A100000_DECRESCENTE = insertionSortDecrescente(A100000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + insertion.imprimir(A100000_DECRESCENTE));

        // Ordenação de vetores com 1000000 (um milhão) de elementos.
        int[] A1000000 = insertion.copiar(insertion.getA1000000(), insertion.getA1000000().length);
        System.out.println("Array antes dos ordenamentos: " + insertion.imprimir(A1000000));

        inicio = Instant.now();
        int[] A1000000_CRESCENTE = insertionSortCrescente(A1000000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + insertion.imprimir(A1000000_CRESCENTE));

        inicio = Instant.now();
        int[] A1000000_DECRESCENTE = insertionSortDecrescente(A1000000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + insertion.imprimir(A1000000_DECRESCENTE));

        // Escreve o conteúdo no arquivo "Tempos.txt".
        insertion.escrever(texto.toString());
    }

    public static int[] insertionSortCrescente(int[] vetor) {
        int j, auxiliar;
        for (int i = 1; i < vetor.length; i++) {
            auxiliar = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] > auxiliar) {
                if (vetor[j] > auxiliar) {
                    vetor[j + 1] = vetor[j];
                    j--;
                }
            }
            vetor[j + 1] = auxiliar;
        }
        return vetor;
    }

    public static int[] insertionSortDecrescente(int[] vetor) {
        int j, auxiliar;
        for (int i = 1; i < vetor.length; i++) {
            auxiliar = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] < auxiliar) {
                if (vetor[j] < auxiliar) {
                    vetor[j + 1] = vetor[j];
                    j--;
                }
            }
            vetor[j + 1] = auxiliar;
        }
        return vetor;
    }

}
