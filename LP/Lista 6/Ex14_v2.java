import java.util.Scanner;

public class Ex14_v2 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o início da contagem: ");
        int inicio = leia.nextInt();
        System.out.print("Digite o fim da contagem: ");
        int fim = leia.nextInt();
        leia.close();

        int soma = 0;
        for(int valor = inicio; valor <= fim; valor++) {
            soma += valor;
        }
        System.out.println("Soma dos valores com FOR: " + soma);

        soma = 0;
        int valor = inicio;
        while(valor <= fim) {
            soma += valor;
            valor++;
        }
        System.out.println("Soma dos valores com WHILE: " + soma);
    }

}
