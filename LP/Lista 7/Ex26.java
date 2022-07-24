public class Ex26 {

    public static void main(String[] args) {
        StringBuilder sequencia = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
            sequencia.append((char) ('a' + Math.random() * 26));
        }
        System.out.println("Sequência gerada: " + sequencia.toString());
        int contador = 0;
        System.out.print("Letras não encontradas na sequência: ");
        String letrasNaoEncontradas = "";
        for (int i = 'a'; i <= 'z'; i++) {
            contador = 0;
            for (int j = 0; j < sequencia.length(); j++) {
                if (sequencia.charAt(j) == i) {
                    contador++;
                }
            }
            if (contador == 0) {
                letrasNaoEncontradas += (char) i + " ";
            }
        }
        if (letrasNaoEncontradas.isEmpty()) {
            System.out.print("todas as letras foram encontradas!\n");
        } else {
            System.out.print(letrasNaoEncontradas + "\n");
        }
        System.out.print("Maior sequência de letras repetidas encontradas: ");
        int maior = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            contador = 0;
            for (int j = 0; j < sequencia.length(); j++) {
                if (i == sequencia.charAt(j)) {
                    contador++;
                } else {
                    contador = 0;
                }
                if (contador > maior) {
                    maior = contador;
                }
            }
        }
        System.out.print(maior + "\n");
        String vogais = "aeiou";
        maior = 0;
        System.out.print("Maior sequência de vogais encontradas (primeira maneira): ");
        for (int i = 0; i < vogais.length(); i++) {
            contador = 0;
            for (int j = 0; j < sequencia.length(); j++) {
                if (vogais.charAt(i) == sequencia.charAt(j)) {
                    contador++;
                } else {
                    contador = 0;
                }
                if (contador > maior) {
                    maior = contador;
                }
            }
        }
        System.out.print(maior + "\n");
        System.out.print("Maior sequência de vogais encontradas (segunda maneira): ");
        maior = 0;
        for (int i = 0; i < vogais.length(); i++) {
            contador = 0;
            String procurado = vogais.substring(0, vogais.length() - i);
            for (int j = 0; j < sequencia.length(); j++) {
                if (sequencia.substring(j).startsWith(procurado)) {
                    contador = procurado.length();
                } else {
                    contador = 0;
                }
                if (contador > maior) {
                    maior = contador;
                }
            }
        }
        System.out.print(maior + "\n");
        System.out.print("Maior sequência alfabética encontrada: ");
        maior = 0;
        String alfabeto = "";
        for (int i = 'a'; i <= 'z'; i++) {
            alfabeto += (char) i;
        }
        for (int i = 0; i <= alfabeto.length(); i++) {
            contador = 0;
            String procurado = alfabeto.substring(0, alfabeto.length() - i);
            for (int j = 0; j < sequencia.length(); j++) {
                if (sequencia.substring(j).startsWith(procurado)) {
                    contador = procurado.length();
                } else {
                    contador = 0;
                }
                if (contador > maior) {
                    maior = contador;
                }
            }
        }
        System.out.print(maior + "\n");
    }

}
