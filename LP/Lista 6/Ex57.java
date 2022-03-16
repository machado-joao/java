import java.util.Scanner;

public class Ex57 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da sequência: ");
        int quantidadeTermos = sc.nextInt();
        sc.close();
        int contadorTermos = 0, numero, acumuladora;
        for(int i = 1; contadorTermos != quantidadeTermos ; i++) {
            numero = i;
            acumuladora = 0;
            for(int j = 1; j < numero; j++) {
                if(numero % j == 0) {
                    acumuladora += j;
                }
            }
            if(acumuladora == numero) {
                System.out.print(numero + " ");
                contadorTermos++;
            }
        }
        System.out.println();
    }

}
