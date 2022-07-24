import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine().toLowerCase();
        scStr.close();
        int contadorLetras = 0, contadorNumeros = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 'a' && frase.charAt(i) <= 'z') {
                contadorLetras++;
            } else if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
                contadorNumeros++;
            }
        }
        System.out.println("Quantidade de letras na frase: " + contadorLetras);
        System.out.println("Quantidade de números na frase: " + contadorNumeros);
    }

}
