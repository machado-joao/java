import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner leiaNo = new Scanner(System.in);
		Scanner leiaStr = new Scanner(System.in);

		Venda[] vendas = new Venda[3];

		for (int i = 0; i < vendas.length; i++) {
			String nome = null;
			int total = 0;
			boolean presencial = false;

			System.out.print("Digite o nome do vendedor(a): ");
			nome = leiaStr.nextLine();

			System.out.print("Digite o total de vendas: ");
			total = leiaNo.nextInt();
			;

			System.out.print("Tipos de vendas\n" +
					"1. Presencial\n" +
					"2. Remoto\n" +
					"Digite a forma da venda: ");
			int tipo = leiaNo.nextInt();
			if (tipo < 1 || tipo > 2) {
				System.out.println("Digite uma opção válida!");
			}

			if (tipo == 1) {
				presencial = true;
			}
			vendas[i] = new Venda(nome, total, presencial);
		}
		leiaNo.close();
		leiaStr.close();

		quebrarLinha();

		System.out.println("Primeiro tipo de listagem:");
		for (int i = 0; i < vendas.length; i++) {
			System.out.printf("(%d) %s\n", i + 1, vendas[i].getNome());
		}

		quebrarLinha();

		System.out.println("Segundo tipo de listagem:");
		Venda[] ordenadoPorValores = Listagem.ordenarPorValores(vendas);
		for (int i = 0; i < ordenadoPorValores.length; i++) {
			System.out.printf("(%d) %s (%d)\n", i + 1, ordenadoPorValores[i].getNome(),
					ordenadoPorValores[i].getTotal());
		}

		quebrarLinha();

		System.out.println("Terceiro tipo de listagem:");
		Venda[] ordenadoPorValoresPresencial = Listagem.ordenarPorValoresPresencial(vendas);
		for (int i = 0; i < ordenadoPorValoresPresencial.length; i++) {
			System.out.printf("(%d) %s (%d)\n", i + 1, ordenadoPorValoresPresencial[i].getNome(),
					ordenadoPorValoresPresencial[i].getTotal());
		}

		quebrarLinha();

		System.out.println("Quarto tipo de listagem:");
		Venda[] ranking = Listagem.criarRanking(vendas);
		for (int i = 0; i < ranking.length; i++) {
			System.out.printf("(%d) %s (%d)\n", i + 1, ranking[i].getNome(), ranking[i].getPontos());
		}

		quebrarLinha();

		/*
		 * System.out.print("Digite o nome do vendedor(a): ");
		 * String nome = leiaStr.nextLine();
		 * leiaStr.close();
		 */

		/*
		 * System.out.print("Digite a quantidade de pontos a serem resgatados: ");
		 * int pontosParaResgatar = leiaNo.nextInt();
		 * leiaNo.close();
		 */

		ArrayList<Venda> listaVendas = new ArrayList<>();
		for (int i = 0; i < vendas.length; i++) {
			listaVendas.add(vendas[i]);
		}

		System.out.println("Quinto, sexto ou sétimo tipo de listagem:");
		ArrayList<Venda> rankingPontosPessoa = Listagem.ordenarPorPontos(listaVendas, "Marcos", 100);
		for (int i = 0; i < rankingPontosPessoa.size(); i++) {
			System.out.printf("(%d) %s (%d)\n", i + 1, rankingPontosPessoa.get(i).getNome(),
					rankingPontosPessoa.get(i).getPontos());
		}

		quebrarLinha();
	}

	public static void quebrarLinha() {
		System.out.print("\n\n");
	}

}
