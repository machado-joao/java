import java.io.File;
import java.time.Duration;
import java.time.Instant;

public class SelectionSort {

    public static void main(String[] args) {

        // Instanciação da classe que contém os vetores e alguns métodos úteis como
        // cópia e impressão de vetores.
        // Deste modo, o código fica mais organizado e orientado a objetos, conforme a
        // premissa da linguagem Java.
        Vetores selection = new Vetores();

        // Declaração dos objetos que averiguam o tempo corrido durante a execução dos
        // algoritmos de ordenação.
        Instant inicio = null;
        Instant fim = null;
        Duration tempo = null;

        // Cria o arquivo que guardará os tempo de duração do algoritmo.
        File arquivo = selection.criar();
        StringBuilder texto = new StringBuilder();
        System.out.println("O tempo dos algoritmos constam no arquivo " + arquivo.getName());

        // Ordenação de vetores com 100 (cem) elementos.
        int[] A100 = selection.copiar(selection.getA100(), selection.getA100().length);
        System.out.println("Array antes dos ordenamentos: " + selection.imprimir(A100));

        inicio = Instant.now();
        int[] A100_CRESCENTE = selectionSortCrescente(A100);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + selection.imprimir(A100_CRESCENTE));

        inicio = Instant.now();
        int[] A100_DECRESCENTE = selectionSortDecrescente(A100);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + selection.imprimir(A100_DECRESCENTE));

        // Ordenação de vetores com 1000 (mil) elementos.
        int[] A1000 = selection.copiar(selection.getA1000(), selection.getA1000().length);
        System.out.println("Array antes dos ordenamentos: " + selection.imprimir(A1000));

        inicio = Instant.now();
        int[] A1000_CRESCENTE = selectionSortCrescente(A1000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + selection.imprimir(A1000_CRESCENTE));

        inicio = Instant.now();
        int[] A1000_DECRESCENTE = selectionSortDecrescente(A1000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + selection.imprimir(A1000_DECRESCENTE));

        // Ordenação de vetores com 10000 (dez mil) elementos.
        int[] A10000 = selection.copiar(selection.getA10000(), selection.getA10000().length);
        System.out.println("Array antes dos ordenamentos: " + selection.imprimir(A10000));

        inicio = Instant.now();
        int[] A10000_CRESCENTE = selectionSortCrescente(A10000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + selection.imprimir(A10000_CRESCENTE));

        inicio = Instant.now();
        int[] A10000_DECRESCENTE = selectionSortDecrescente(A10000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 10000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + selection.imprimir(A10000_DECRESCENTE));

        // Ordenação de vetores com 10000 (cem mil) elementos.
        int[] A100000 = selection.copiar(selection.getA100000(), selection.getA100000().length);
        System.out.println("Array antes dos ordenamentos: " + selection.imprimir(A100000));

        inicio = Instant.now();
        int[] A100000_CRESCENTE = selectionSortCrescente(A100000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + selection.imprimir(A100000_CRESCENTE));

        inicio = Instant.now();
        int[] A100000_DECRESCENTE = selectionSortDecrescente(A100000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + selection.imprimir(A100000_DECRESCENTE));

        // Ordenação de vetores com 1000000 (um milhão) de elementos.
        int[] A1000000 = selection.copiar(selection.getA1000000(), selection.getA1000000().length);
        System.out.println("Array antes dos ordenamentos: " + selection.imprimir(A1000000));

        inicio = Instant.now();
        int[] A1000000_CRESCENTE = selectionSortCrescente(A1000000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + selection.imprimir(A1000000_CRESCENTE));

        inicio = Instant.now();
        int[] A1000000_DECRESCENTE = selectionSortDecrescente(A1000000);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos decrescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento decrescente: " + selection.imprimir(A1000000_DECRESCENTE));

        // Escreve o conteúdo no arquivo "Tempos.txt".
        selection.escrever(texto.toString());
    }

    public static int[] selectionSortCrescente(int[] vetor) {
        int posicaoMenor, auxiliar;
        for (int i = 0; i < vetor.length; i++) {
            posicaoMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
            auxiliar = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = auxiliar;
        }
        return vetor;
    }

    public static int[] selectionSortDecrescente(int[] vetor) {
        int posicaoMaior, auxiliar;
        for (int i = 0; i < vetor.length; i++) {
            posicaoMaior = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] > vetor[posicaoMaior]) {
                    posicaoMaior = j;
                }
            }
            auxiliar = vetor[posicaoMaior];
            vetor[posicaoMaior] = vetor[i];
            vetor[i] = auxiliar;
        }
        return vetor;
    }

}
