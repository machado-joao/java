import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) throws InterruptedException {

		Scanner leitorNum = new Scanner(System.in);

		int opcao = 0;
		int qtdTermos = 0;
		do {
			do {
				System.out
						.println("Menu de opções: " + "(1) Fatorial" + " (2) Fibonacci" + " (3) Primos" + " (4) Sair");
				System.out.print("Sua escolha: ");
				opcao = leitorNum.nextInt();
				if (opcao < 1 && opcao > 6) {
					System.out.println("Escolha uma opção entre 1 e 4!");
				}
			} while (opcao < 1 && opcao > 4);

			if (opcao >= 1 && opcao <= 3) {
				do {
					System.out.print("Digite a quantidade de termos desejados: ");
					qtdTermos = leitorNum.nextInt();
					if (qtdTermos < 1) {
						System.out.println("Digite uma quantidade de termos válida!");
					}
				} while (qtdTermos < 1);
			}

			String sequencia = "";

			switch (opcao) {
				case 1:
					for (int termoFatorial = 1; termoFatorial <= qtdTermos; termoFatorial++) {
						int fatorial = 1;
						int valor = termoFatorial;
						while (valor >= 2) {
							fatorial *= valor;
							valor--;
						}
						sequencia = fatorial + " " + sequencia;
					}
					break;
				case 2:
					int primeiro = 0, segundo = 1, fibonacci = 0;
					int qtdTermosFibonacci = 1;
					while (qtdTermosFibonacci <= qtdTermos) {
						sequencia = primeiro + " " + sequencia;
						fibonacci = primeiro + segundo;
						primeiro = segundo;
						segundo = fibonacci;
						qtdTermosFibonacci++;
					}
					break;
				case 3:
					int termoPrimo = 1;
					int numero = 2;
					while (termoPrimo <= qtdTermos) {
						int contadorPrimos = 0;
						for (int divisor = 1; divisor <= numero; divisor++) {
							if (numero % divisor == 0) {
								contadorPrimos++;
							}
						}
						if (contadorPrimos == 2) {
							termoPrimo++;
							sequencia = numero + " " + sequencia;
						}
						numero++;
					}
					break;
				case 4:
					System.out.println("Saindo...");
					Thread.currentThread();
					Thread.sleep(2000);
					break;
			}
			if (opcao >= 1 && opcao <= 3) {
				System.out.println("Sequência inversa: " + sequencia);
			}
		} while (opcao != 4);
		leitorNum.close();
	}

}
