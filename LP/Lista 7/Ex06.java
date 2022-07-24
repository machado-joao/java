import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine().toUpperCase();
        System.out.print("Digite uma letra: ");
        char letra = scStr.nextLine().toUpperCase().charAt(0);
        scStr.close();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        System.out.println("Quantidade de letras \"" + letra + "\" encontradas na frase: " + contador);
    }

}
