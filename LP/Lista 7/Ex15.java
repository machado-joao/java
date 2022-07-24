import java.util.Scanner;

public class Ex15 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scStr.nextLine();
        scStr.close();
        int contador = 0;
        boolean existe = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) >= '0' && frase.charAt(i) <= '9') {
                contador++;
            }
        }
        if (contador > 0) {
            existe = true;
        }
        System.out.println("Existem números na frase digitada? " + (existe ? "Sim" : "Não"));
    }

}
