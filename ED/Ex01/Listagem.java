import java.util.ArrayList;

public class Listagem implements Comparable<Object> {
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static Venda[] ordenarPorNomes(Venda[] vendas) {
        for (int i = 0; i < vendas.length; i++) {
            for (int j = i + 1; j < vendas.length; j++) {
                if (vendas[i].getNome().compareTo(vendas[j].getNome()) > 0) {
                    Venda aux = vendas[i];
                    vendas[i] = vendas[j];
                    vendas[j] = aux;
                }
            }
        }
        return vendas;
    }

    public static Venda[] ordenarPorValores(Venda[] vendas) {
        for (int i = 0; i < vendas.length; i++) {
            for (int j = i + 1; j < vendas.length; j++) {
                if (vendas[i].getTotal() < vendas[j].getTotal()) {
                    Venda aux = vendas[i];
                    vendas[i] = vendas[j];
                    vendas[j] = aux;
                }
            }
        }
        return vendas;
    }

    public static Venda[] ordenarPorValoresPresencial(Venda[] vendas) {
        int quantidadePresenciais = 0;
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i].getPresencial()) {
                quantidadePresenciais++;
            }
        }
        Venda[] vendasPresenciais = new Venda[quantidadePresenciais];
        int indice = 0;
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i].getPresencial()) {
                vendasPresenciais[indice++] = vendas[i];
            }
        }
        vendasPresenciais = ordenarPorValores(vendasPresenciais);
        return vendasPresenciais;
    }

    public static Venda[] criarRanking(Venda[] vendas) {
        int contadorIndices = 0;
        for (int i = 0; i < vendas.length; i++) {
            if (vendas[i] != null && contadorIndices <= 10) {
                contadorIndices++;
            }
        }
        Venda[] ranking = new Venda[contadorIndices];
        int indiceVendas = vendas.length - 1, indiceRanking = 0;
        while (indiceVendas >= 0) {
            ranking[indiceRanking++] = vendas[indiceVendas--];
        }
        int pontos = 100;
        for (int i = 0; i < ranking.length; i++) {
            ranking[i].setPontos(pontos);
            pontos -= 10;
        }
        return ranking;
    }

    public static ArrayList<Venda> ordenarPorPontos(ArrayList<Venda> vendas, String nome, int valor) {
        // Cria uma nova lista somente com os valores referentes ao nome passado
        ArrayList<Venda> vendasPessoa = new ArrayList<>();
        for (int i = 0; i < vendas.size(); i++) {
            if (vendas.get(i).getNome().equalsIgnoreCase(nome)) {
                vendasPessoa.add(vendas.get(i));
            }
        }

        // Ordena a lista de vendas referente ao nome passado
        for (int i = 0; i < vendasPessoa.size(); i++) {
            for (int j = i + 1; j < vendasPessoa.size(); j++) {
                if (vendasPessoa.get(i).getPontos() < vendasPessoa.get(j).getPontos()) {
                    Venda aux = vendasPessoa.get(i);
                    vendasPessoa.set(i, vendasPessoa.get(j));
                    vendasPessoa.set(j, aux);
                }
            }
        }

        // Debita os pontos da conta
        for (int i = vendasPessoa.size() - 1; i >= 0; i--) {
            if (vendasPessoa.get(i).getPontos() >= valor) {
                vendasPessoa.get(i).setPontos(vendasPessoa.get(i).getPontos() - valor);
                int pontosRestantes = vendasPessoa.get(i).getPontos();
                if (pontosRestantes == 0) {
                    System.out.println("Você resgatou todos os pontos da conta!");
                    vendasPessoa.remove(i);
                } else {
                    System.out.println("Você resgatou " + valor + " pontos da conta!");
                    System.out.println("Você ainda possui " + pontosRestantes + " pontos na conta!");
                }
                return vendasPessoa;
            }
        }

        int saldoPontos = 0;
        for (int i = 0; i < vendasPessoa.size(); i++) {
            saldoPontos += vendasPessoa.get(i).getPontos();
        }
        for (int i = vendasPessoa.size() - 1; i > 0; i--) {
            vendasPessoa.remove(i);
        }
        vendasPessoa.get(0).setPontos(saldoPontos);
        if (vendasPessoa.get(0).getPontos() >= valor) {
            vendasPessoa.get(0).setPontos(vendasPessoa.get(0).getPontos() - valor);
            int pontosRestantes = vendasPessoa.get(0).getPontos();
            if (pontosRestantes == 0) {
                System.out.println("Você resgatou todos os pontos!");
                vendasPessoa.remove(0);
            }
            return vendasPessoa;
        } else {
            if (vendasPessoa.get(0).getPontos() == 0) {
                System.out.println("Você não possui pontos suficientes!");
                return vendasPessoa;
            } else {
                System.out.println("Você resgatou seus " + vendasPessoa.get(0).getPontos() + " pontos!");
                int pontosFaltantes = valor - vendasPessoa.get(0).getPontos();
                vendasPessoa.get(0).setPontos(Math.abs(vendasPessoa.get(0).getPontos() - valor));
                System.out.println("Para resgatar o restante, você precisa de " + pontosFaltantes + " pontos!");
                return vendasPessoa;
            }
        }
    }
}
