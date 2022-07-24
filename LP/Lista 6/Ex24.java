public class Ex24 {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabuada do número " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }

}
