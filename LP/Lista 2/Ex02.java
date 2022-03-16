import java.util.Random;

public class Ex02 {
    
    public static void main(String[] args) {
        int numeroAleatorio;
        
        System.out.println("Primeira maneira:");
        numeroAleatorio = (int) (Math.random() * 100 + 1);
        System.out.println("Número aleatório: " + numeroAleatorio);

        System.out.println("Segunda maneira:");
        Random geradorAleatorios = new Random();
        numeroAleatorio = geradorAleatorios.nextInt(100) + 1;
        System.out.println("Número aleatório: " + numeroAleatorio);
    }

}
