import java.util.Scanner;

public class Ex25 {
    
    public static void main(String[] args) {
        Scanner scStr = new Scanner(System.in);

        boolean estaForte = false;
        do {
            System.out.print("Digite a senha: ");
            String senha = scStr.nextLine();
            int contadorMaiusculas = 0, contadorLetras = 0, contadorNumeros = 0, contadorSimbolos = 0;
            String simbolos = "!@#$%&*()+";
            for(int i = 0; i < senha.length(); i++) {
                if(senha.charAt(i) >= 'a' && senha.charAt(i) <= 'z') {
                    contadorLetras++;
                }
                if(senha.charAt(i) >= 'A' && senha.charAt(i) <= 'Z') {
                    contadorMaiusculas++;
                    contadorLetras++;
                }
                if(senha.charAt(i) >= '0' && senha.charAt(i) <= '9') {
                    contadorNumeros++;
                }
                for(int j = 0; j < simbolos.length(); j++) {
                    if(senha.charAt(i) == simbolos.charAt(j)) {
                        contadorSimbolos++;
                    }
                }
            }
            if(senha.length() >= 10) {
                if(contadorMaiusculas >= 3 && contadorLetras >= 3 && contadorNumeros >= 3 && contadorSimbolos >= 2) {
                    System.out.println("Senha forte o suficiente! Parabéns!");
                    estaForte = true;
                } else {
                    System.out.println("Digite uma senha mais forte!");
                }
            } else {
                System.out.println("A senha precisa ter ao menos 10 caracteres!");
            }
        } while(!estaForte);
        scStr.close();
    }

}
