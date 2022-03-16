import java.util.Scanner;

public class Ex22 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine().toLowerCase();
        System.out.print("Digite uma palavra: ");
        String palavra = scStr.nextLine().toLowerCase();
        scStr.close();
        int contador = 0;
        for(int i = 0; i < frase.length(); i++) {
            if(frase.substring(i).startsWith(palavra)) {
                contador++;
            }
        }
        System.out.println("A palavra " + palavra + " ocorre " + contador + " vezes na frase!");
    }

}
