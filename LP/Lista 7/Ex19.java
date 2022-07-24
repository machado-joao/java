import java.util.Scanner;
import java.util.Stack;

public class Ex19 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        Stack<Character> pilha = new Stack<>();
        for (int i = 0; i < frase.length(); i++) {
            pilha.push(frase.charAt(i));
        }
        String fraseReversa = "";
        while (!pilha.isEmpty()) {
            fraseReversa += pilha.pop();
        }
        fraseReversa.toString();
        if (frase.equalsIgnoreCase(fraseReversa)) {
            System.out.println("A frase é um palíndromo!");
        } else {
            System.out.println("A frase não é um palíndromo!");
        }
    }

}
