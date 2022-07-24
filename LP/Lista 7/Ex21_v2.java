import java.util.Scanner;

public class Ex21_v2 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            System.out.println(palavra);
        }
    }

}
