import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        double celsius, fahrenheit;
        char escolha;
        do {
            do {
                System.out.print("[C] Celsius [F] Fahrenheit [S] Sair: ");
                escolha = scStr.nextLine().toUpperCase().charAt(0);
                if(escolha != 'C' && escolha != 'F' && escolha != 'S') {
                    System.out.println("Opção inválida!");
                }
            } while(escolha != 'C' && escolha != 'F' && escolha != 'S');

            switch(escolha) {
                case 'C':
                    System.out.print("Digite a temperatura em Celsius: ");
                    celsius = sc.nextDouble();
                    fahrenheit = celsiusParaFahrenheit(celsius);
                    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                    break;
                case 'F':
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    celsius = farenheitParaCelsius(fahrenheit);
                    System.out.println("A temperatura em Celsius é: " + celsius);
                    break;
                case 'S':
                    System.out.println("Saindo...");
                    break;
            }
        } while(escolha != 'S');
        sc.close();
        scStr.close();
    }

    private static double celsiusParaFahrenheit(double celsius) {
        return (9.0 * celsius / 5.0) + 32;
    }

    private static double farenheitParaCelsius(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

}
