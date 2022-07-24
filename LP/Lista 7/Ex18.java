import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma sequência: ");
        String sequencia = scStr.nextLine();
        scStr.close();
        int contador = 0;
        boolean sequenciaBinaria = false;
        for (int i = 0; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == '0' || sequencia.charAt(i) == '1') {
                contador++;
            }
        }
        if (contador == 8 && sequencia.length() == 8) {
            sequenciaBinaria = true;
        }
        System.out.println("É uma sequência binária? " + (sequenciaBinaria ? "Sim" : "Não"));
    }

}
