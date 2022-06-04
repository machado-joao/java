import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) throws InterruptedException {

		Scanner leitorNum = new Scanner(System.in);
		Scanner leitorStr = new Scanner(System.in);

		char continuar = ' ';
		do {
			// Gera o número secreto e inicializa as variáveis de controle
			System.out.println("Gerando o número secreto...");
			int numSecreto = (int) (Math.random() * 10 + 1);
			int qtdVidas = 3;
			boolean ganhou = false;
			int num = 0;
			Thread.currentThread();
			Thread.sleep(2000);
			System.out.println("O número secreto foi gerado!");

			// Repete enquanto o usuário possuir vidas ou não tiver ganhado o jogo
			while (qtdVidas >= 1 && !ganhou) {
				do {
					System.out.printf("(%d/3) Qual é o número secreto? ", qtdVidas);
					num = leitorNum.nextInt();
					if (num < 1 && num > 10) {
						System.out.println("Digite um número entre 1 e 10!");
					}
				} while (num < 1 && num > 10);

				if (num == numSecreto) {
					ganhou = true;
					System.out.printf("Você venceu! O número secreto era %d!\n", numSecreto);
				} else {
					qtdVidas--;
					System.out.printf("Número errado! Restam %d vidas!\n", qtdVidas);
				}
			}

			if (!ganhou) {
				System.out.printf("O número secreto era %d\n", numSecreto);
			}

			System.out.print("Deseja continuar jogando? [S/N] ");
			continuar = leitorStr.nextLine().toUpperCase().charAt(0);
		} while (continuar == 'S');
		leitorNum.close();
		leitorStr.close();
		System.out.println("Você saiu!");
	}

}
