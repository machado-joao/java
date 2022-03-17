import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        double celsius, fahrenheit, kelvin;
        char escolha;
        do {
            do {
                System.out.print("[C] Celsius [F] Fahrenheit [K] Kelvin [S] Sair: ");
                escolha = scStr.nextLine().toUpperCase().charAt(0);
                if(escolha != 'C' && escolha != 'F' && escolha != 'K' && escolha != 'S') {
                    System.out.println("Opção inválida!");
                }
            } while(escolha != 'C' && escolha != 'F' && escolha != 'K' && escolha != 'S');

            switch(escolha) {
                case 'C':
                    System.out.print("Digite a temperatura em Celsius: ");
                    celsius = sc.nextDouble();
                    System.out.println("A temperatura em Fahrenheit é: " + celsiusParaFahrenheit(celsius));
                    System.out.println("A temperatura em Kelvin é: " + celsiusParaKelvin(celsius));
                    break;
                case 'F':
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("A temperatura em Celsius é: " + farenheitParaCelsius(fahrenheit));
                    System.out.println("A temperatura em Kelvin é: " + celsiusParaKelvin(farenheitParaCelsius(fahrenheit)));
                    break;
                case 'K':
                    System.out.print("Digite a temperatura em Kelvin: ");
                    kelvin = sc.nextDouble();
                    System.out.println("A temperatura em Celsius é: " + kelvinParaCelsius(kelvin));
                    System.out.println("A temperatura em Fahrenheit é: " + celsiusParaFahrenheit(kelvinParaCelsius(kelvin)));
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

    private static double celsiusParaKelvin(double celsius) {
        return celsius + 273.0;
    }

    private static double kelvinParaCelsius(double kelvin) {
        return kelvin - 273.0;
    }

    private static double farenheitParaCelsius(double fahrenheit) {
        return 5.0 * (fahrenheit - 32) / 9.0;
    }

}
