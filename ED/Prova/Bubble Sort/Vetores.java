import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Vetores {
    private int[] A100 = new int[100];
    private int[] A1000 = new int[1000];
    private int[] A10000 = new int[10000];
    private int[] A100000 = new int[100000];
    private int[] A1000000 = new int[1000000];

    public Vetores() {

        Random random = new Random();

        for (int i = 0; i < A1000000.length; i++) {
            if (i < A100.length) {
                this.A100[i] = random.nextInt(101);
            }

            if (i < A1000.length) {
                this.A1000[i] = random.nextInt(1001);
            }

            if (i < A10000.length) {
                this.A10000[i] = random.nextInt(10001);
            }

            if (i < A100000.length) {
                this.A100000[i] = random.nextInt(100001);
            }

            this.A1000000[i] = random.nextInt(1000001);
        }
    }

    public int[] getA100() {
        return this.A100;
    }

    public int[] getA1000() {
        return this.A1000;
    }

    public int[] getA10000() {
        return this.A10000;
    }

    public int[] getA100000() {
        return this.A100000;
    }

    public int[] getA1000000() {
        return this.A1000000;
    }

    public int[] copiar(int[] vetor, int tamanho) {
        return Arrays.copyOf(vetor, tamanho);
    }

    public String imprimir(int[] vetor) {
        return Arrays.toString(vetor);
    }

    public File criar() {
        try {
            File file = new File("Tempos.txt");
            if (file.createNewFile()) {
                return file;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void escrever(String texto) {
        try {
            FileWriter writer = new FileWriter("Tempos.txt");
            writer.write(texto);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
