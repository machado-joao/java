import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        sc.close();

        double fahrenheit = celsiusParaFahrenheit(celsius);
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }

    private static double celsiusParaFahrenheit(double celsius) {
        return (9.0 * celsius / 5.0) + 32;
    }

}
