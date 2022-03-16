import java.util.Scanner;

public class Ex27 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);
        
        boolean saoMesmoTamanho = false;
        String frase1, frase2;
        do {
            System.out.print("Digite uma frase: ");
            frase1 = scStr.nextLine();
            System.out.print("Digite outra frase: ");
            frase2 = scStr.nextLine();
            if(frase1.length() == frase2.length()) {
                saoMesmoTamanho = true;
            } else {
                System.out.println("Digite frases de tamanho igual!");
            }
        } while(!saoMesmoTamanho);
        scStr.close();
        StringBuilder frasesConcatenadas = new StringBuilder();
        for(int i = 0; i < frase1.length(); i++) {
            frasesConcatenadas.append(frase1.charAt(i));
            frasesConcatenadas.append(frase2.charAt(i));
        }
        System.out.println("Frases concatenadas: " + frasesConcatenadas);
    }

}
