import java.util.Scanner;

public class Ex20 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        String[] palavras = frase.split(" ");
        System.out.println("Quantidade de palavras na frase: " + palavras.length);
    }

}
