import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Horário de início: ");
        int inicio = sc.nextInt();
        System.out.print("Horário de término: ");
        int fim = sc.nextInt();
        sc.close();
        int tempo = fim - inicio;
        if (tempo <= 0) {
            tempo += 24;
        }
        System.out.println("O jogo teve " + tempo + "h de duração!");
    }

}
