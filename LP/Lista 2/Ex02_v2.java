import java.util.Random;

public class Ex02_v2 {

    public static void main(String[] args) {
        int numeroAleatorio = 0;

        Random geradorAleatorios = new Random();
        numeroAleatorio = geradorAleatorios.nextInt(100) + 1;
        System.out.println("Número aleatório: " + numeroAleatorio);
    }

}
