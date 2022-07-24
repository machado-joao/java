public class Ex01 {

    public static void main(String[] args) {
        double nota = Math.random() * 10;
        System.out.printf("Nota do aluno: %.1f\n", nota);
        if (nota >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }

}
