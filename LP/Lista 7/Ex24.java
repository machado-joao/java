import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        System.out.print("Digite uma sequência: ");
        String sequencia = scStr.nextLine();
        scStr.close();
        System.out.println("Sequência digitada: " + sequencia);
        int contador = 0, maiorSequencia = 0;
        for (int i = 0; i < sequencia.length(); i++) {
            if (sequencia.charAt(i) == '1') {
                contador++;
            } else {
                contador = 0;
            }
            if (contador > maiorSequencia) {
                maiorSequencia = contador;
            }
        }
        System.out.println("A maior sequência de 1\'s encontrada foi " + maiorSequencia);
    }

}
