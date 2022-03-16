import java.util.Scanner;

public class Ex20 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maior = 0, menor = 0;
        for(int i = 1; i <= 100; i++) {
            System.out.print("Digite um valor: ");
            int valor = sc.nextInt();
            if(i == 1) {
                maior = valor;
                menor = valor;
            }
            if(valor > maior) {
                maior = valor;
            }
            if(valor < menor) {
                menor = valor;
            }
        }
        sc.close();
        System.out.println("Maior valor digitado: " + maior);
        System.out.println("Menor valor digitado: " + menor);
    }

}
