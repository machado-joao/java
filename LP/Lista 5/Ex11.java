import java.util.Scanner;

public class Ex11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int numero2 = sc.nextInt();
        System.out.print("Digite uma operação aritmética:\n" +
                "1 - Adição\n" +
                "2 - Subtração\n" +
                "3 - Multiplicação\n" +
                "4 - Divisão\n" +
                "Escolha: ");
        int escolha = sc.nextInt();
        sc.close();

        int resultado = 0;
        switch (escolha) {
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 == 0) {
                    numero2 = 1;
                }
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida!");
        }
        System.out.println("Resultado: " + resultado);
    }

}
