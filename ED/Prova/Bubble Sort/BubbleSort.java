import java.io.File;
import java.time.Duration;
import java.time.Instant;

public class BubbleSort {

    public static void main(String[] args) {

        // Instanciação da classe que contém os vetores e alguns métodos úteis como
        // cópia e impressão de vetores.
        // Deste modo, o código fica mais organizado e orientado a objetos, conforme a
        // premissa da linguagem Java.
        Vetores bubble = new Vetores();

        // Declaração dos objetos que averiguam o tempo corrido durante a execução dos
        // algoritmos de ordenação.
        Instant inicio = null;
        Instant fim = null;
        Duration tempo = null;

        // Cria o arquivo que guardará os tempo de duração do algoritmo.
        File arquivo = bubble.criar();
        StringBuilder texto = new StringBuilder();
        System.out.println("O tempo dos algoritmos constam no arquivo " + arquivo.getName());

        // Ordenação de vetores com 100 (cem) elementos.
        int[] A100 = bubble.copiar(bubble.getA100(), bubble.getA100().length);
        System.out.println("Array antes dos ordenamentos: " + bubble.imprimir(A100));

        inicio = Instant.now();
        int[] A100_CRESCENTE = bubbleSortCrescente(A100);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + bubble.imprimir(A100_CRESCENTE));

        inicio = Instant.now();
        int[] A100_DECRESCENTE = bubbleSortDecrescente(A100);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + bubble.imprimir(A100_DECRESCENTE));

        // Ordenação com 1000 (mil) elementos.
        int[] A1000 = bubble.copiar(bubble.getA1000(), bubble.getA1000().length);
        System.out.println("Array antes dos ordenamentos: " + bubble.imprimir(A1000));

        inicio = Instant.now();
        int[] A1000_CRESCENTE = bubbleSortCrescente(A1000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + bubble.imprimir(A1000_CRESCENTE));

        inicio = Instant.now();
        int[] A1000_DECRESCENTE = bubbleSortDecrescente(A1000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + bubble.imprimir(A1000_DECRESCENTE));

        // Ordenação com 10000 (dez mil) elementos.
        int[] A10000 = bubble.copiar(bubble.getA10000(), bubble.getA10000().length);
        System.out.println("Array antes dos ordenamentos: " + bubble.imprimir(A10000));

        inicio = Instant.now();
        int[] A10000_CRESCENTE = bubbleSortCrescente(A10000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + bubble.imprimir(A10000_CRESCENTE));

        inicio = Instant.now();
        int[] A10000_DECRESCENTE = bubbleSortDecrescente(A10000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + bubble.imprimir(A10000_DECRESCENTE));

        // Ordenação com 100000 (cem mil) elementos.
        int[] A100000 = bubble.copiar(bubble.getA100000(), bubble.getA100000().length);
        System.out.println("Array antes dos ordenamentos: " + bubble.imprimir(A100000));

        inicio = Instant.now();
        int[] A100000_CRESCENTE = bubbleSortCrescente(A100000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + bubble.imprimir(A100000_CRESCENTE));

        inicio = Instant.now();
        int[] A100000_DECRESCENTE = bubbleSortDecrescente(A100000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + bubble.imprimir(A100000_DECRESCENTE));

        // Ordenação com 1000000 (um milhão) de elementos.
        int[] A1000000 = bubble.copiar(bubble.getA1000000(), bubble.getA1000000().length);
        System.out.println("Array antes dos ordenamentos: " + bubble.imprimir(A1000000));

        inicio = Instant.now();
        int[] A1000000_CRESCENTE = bubbleSortCrescente(A1000000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + bubble.imprimir(A1000000_CRESCENTE));

        inicio = Instant.now();
        int[] A1000000_DECRESCENTE = bubbleSortDecrescente(A1000000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + bubble.imprimir(A1000000_DECRESCENTE));

        // Escreve o conteúdo no arquivo "Tempos.txt".
        bubble.escrever(texto.toString());
    }

    public static int[] bubbleSortCrescente(int[] vetor) {
        int auxiliar = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }
        return vetor;
    }

    public static int[] bubbleSortDecrescente(int[] vetor) {
        int auxiliar = 0;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = auxiliar;
                }
            }
        }
        return vetor;
    }

}
