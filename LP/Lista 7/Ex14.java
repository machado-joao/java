import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine().toLowerCase();
        System.out.print("Digite uma letra: ");
        char letra = scStr.nextLine().toLowerCase().charAt(0);
        scStr.close();
        System.out.println("Frase: " + frase);
        System.out.println("Frase com caractere substituído: " + frase.replace(letra, '*'));
    }

}
