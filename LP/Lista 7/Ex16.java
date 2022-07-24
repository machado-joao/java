import java.util.Scanner;

public class Ex16 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        int contador = 0, contadorEspacos = 0;
        boolean todosMaiusculos = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= 'A' && frase.charAt(i) <= 'Z') {
                contador++;
            } else if (frase.charAt(i) == ' ') {
                contadorEspacos++;
            }
        }
        if (contador == (frase.length() - contadorEspacos)) {
            todosMaiusculos = true;
        }
        System.out.println("Todos os caracteres da frase são maúsculos? " + (todosMaiusculos ? "Sim" : "Não"));
    }

}
