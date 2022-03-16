import java.util.Scanner;

public class Ex48 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int numero, divisores, contadorTermos = 0;
        for(int i = 1; contadorTermos != quantidadeTermos; i++) {
            numero = i;
            divisores = 0;
            for(int j = 1; j <= numero; j++) {
                if(numero % j == 0) {
                    divisores++;
                }
            }
            if(divisores == 2) {
                System.out.print(numero + " ");
                contadorTermos++;
            }
        }
        System.out.println();
    }

}
