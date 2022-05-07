import java.util.Scanner;

public class Ex05_v2 {
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n1 = leia.nextInt();
        System.out.print("Digite um outro valor: ");
        int n2 = leia.nextInt();
        System.out.print("Digite um outro valor: ");
        int n3 = leia.nextInt();
        leia.close();

        System.out.println("Maior do método que recebe dois parâmetros: " + maior(n1, n2));
        System.out.println("Maior do método que recebe três parâmetros: " + maior(n1, n2, n3));
        System.out.println("Maior do método que recebe dois parâmetros de ponto flutuante: " + maior(6.5, 8.0));
    }

    public static int maior(int n1, int n2) {
        if(n1 > n2) {
            return n1;
        }
        return n2;
    }

    public static int maior(int n1, int n2, int n3) {
        if(n1 > n2 && n1 > n3) {
            return n1;
        } else if(n2 > n1 && n2 > n3) {
            return n2;
        }
        return n3;
    }

    public static double maior(double n1, double n2) {
        if(n1 > n2) {
            return n1;
        }
        return n2;
    }

}
