import java.util.Scanner;

public class Ex39 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadeTermos = 0;
        do {
            System.out.print("Digite a quantidade de termos da sequência: ");
            quantidadeTermos = sc.nextInt();
            if(quantidadeTermos == 0) {
                break;
            }
            if(quantidadeTermos < 0) {
                System.out.println("Digite uma quantidade positiva!");
            }
        } while(quantidadeTermos < 0);
        sc.close();
        int numerador = 1, denominador = quantidadeTermos;
        double somaSequencia = 0;
        for(int i = 1; i <= quantidadeTermos; i++) {
            System.out.print(numerador + "/" + denominador + " ");
            somaSequencia += (double) numerador / denominador;
            numerador++;
            denominador--;
        }
        System.out.printf("\nSoma da sequência %.5f\n", somaSequencia);
    }

}
