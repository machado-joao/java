import java.util.Scanner;

public class Ex30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        int escolha = 0;
        do {
            System.out.print("Digite uma frase: ");
            String frase = scStr.nextLine().toLowerCase();
            System.out.print("Opções:\n" +
                    "1 - Criptografar\n" +
                    "2 - Descriptografar\n" +
                    "3 - Sair\n" +
                    "Escolha: ");
            escolha = sc.nextInt();

            String novaFrase = "";
            boolean encontrou = false;
            String criptografia = "abcdefghijklmnopqrstuvwxyz";
            String descriptografia = "nopqrstuvwxyzabcdefghijklm";
            switch (escolha) {
                case 1:
                    for (int i = 0; i < frase.length(); i++) {
                        encontrou = false;
                        for (int j = 0; j < criptografia.length(); j++) {
                            if (frase.charAt(i) == criptografia.charAt(j)) {
                                encontrou = true;
                                novaFrase += descriptografia.charAt(j);
                            }
                        }
                        if (!encontrou) {
                            novaFrase += frase.charAt(i);
                        }
                    }
                    System.out.println("Frase criptografada: " + novaFrase);
                    break;
                case 2:
                    for (int i = 0; i < frase.length(); i++) {
                        encontrou = false;
                        for (int j = 0; j < descriptografia.length(); j++) {
                            if (frase.charAt(i) == descriptografia.charAt(j)) {
                                encontrou = true;
                                novaFrase += criptografia.charAt(j);
                            }
                        }
                        if (!encontrou) {
                            novaFrase += frase.charAt(i);
                        }
                    }
                    System.out.println("Frase descriptografada: " + novaFrase);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
        } while (escolha != 3);
        sc.close();
        scStr.close();
    }

}
