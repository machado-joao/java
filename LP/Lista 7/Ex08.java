import java.util.Scanner;

public class Ex08 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine().toUpperCase();
        scStr.close();
        int contador;
        for(char letra = 'A'; letra <= 'Z'; letra++)  {
            contador = 0;
            for(int i = 0; i < frase.length(); i++) {
                if(frase.charAt(i) == letra) {
                    contador++;
                }
            }
            if(contador > 0) {
                System.out.printf("%c = %d\n", letra, contador);
            }
        }
    }

}
