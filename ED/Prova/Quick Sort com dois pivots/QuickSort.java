import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

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
        int[] A100_CRESCENTE = quick.copiar(quick.getA100(), quick.getA100().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A100));

        inicio = Instant.now();
        Arrays.sort(A100_CRESCENTE);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A100_CRESCENTE));

        // Ordenação de vetores com 1000 (mil) elementos.
        int[] A1000 = quick.copiar(quick.getA1000(), quick.getA1000().length);
        int[] A1000_CRESCENTE = quick.copiar(quick.getA1000(), quick.getA1000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A1000));

        inicio = Instant.now();
        Arrays.sort(A1000_CRESCENTE);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A1000_CRESCENTE));

        // Ordenação de vetores com 10000 (dez mil) elementos.
        int[] A10000 = quick.copiar(quick.getA10000(), quick.getA10000().length);
        int[] A10000_CRESCENTE = quick.copiar(quick.getA10000(), quick.getA10000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A10000));

        inicio = Instant.now();
        Arrays.sort(A10000_CRESCENTE);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A10000_CRESCENTE));

        // Ordenação de vetores com 100000 (cem mil) elementos.
        int[] A100000 = quick.copiar(quick.getA100000(), quick.getA100000().length);
        int[] A100000_CRESCENTE = quick.copiar(quick.getA100000(), quick.getA100000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A100000));

        inicio = Instant.now();
        Arrays.sort(A100000_CRESCENTE);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 100000 elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A100000_CRESCENTE));

        // Ordenação de vetores com 100 (um milhão) de elementos.
        int[] A1000000 = quick.copiar(quick.getA1000000(), quick.getA1000000().length);
        int[] A1000000_CRESCENTE = quick.copiar(quick.getA1000000(), quick.getA1000000().length);
        System.out.println("Array antes dos ordenamentos: " + quick.imprimir(A1000000));

        inicio = Instant.now();
        Arrays.sort(A1000000_CRESCENTE);
        fim = Instant.now();
        tempo = Duration.between(inicio, fim);
        texto.append("Tempo do vetor com 1000000 de elementos crescente: " + tempo + "\n");
        System.out.println("Array depois do ordenamento crescente: " + quick.imprimir(A1000000_CRESCENTE));

        // Escreve o conteúdo no arquivo "Tempos.txt".
        quick.escrever(texto.toString());
    }

}
