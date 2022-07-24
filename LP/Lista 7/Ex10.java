import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                contador++;
            }
        }
        System.out.println("Quantidade de letras maiúsculas na frase: " + contador);
    }

}
