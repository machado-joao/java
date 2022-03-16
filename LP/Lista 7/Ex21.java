import java.util.Scanner;

public class Ex21 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        for(int i = 0; i < frase.length(); i++) {
            System.out.print(frase.charAt(i));
            if(frase.charAt(i) == ' ') {
                System.out.print("\n");
            }
        }
        System.out.println();
    }

}
