import java.util.Scanner;

public class Ex12 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine().toLowerCase();
        scStr.close();
        int contadorVogais = 0;
        for(int i = 0; i < frase.length(); i++)  {
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u') {
                contadorVogais++;
            }
        }
        System.out.println("Quantidade de vogais na frase: " + contadorVogais);
    }
    
}
