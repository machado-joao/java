public class Ex06_v2 {

    public static void main(String[] args) {
        String[] disciplinas = { "Lógica de Programação",
                "Linguagem de Programação",
                "Programação Orientada a Objetos",
                "Estrutura de Dados" };

        for (int posicao = 0; posicao < disciplinas.length; posicao++) {
            System.out.printf("LAB%d\n", posicao + 1);
            System.out.printf("\t%s\n", disciplinas[posicao]);
        }
    }

}
