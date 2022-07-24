public class Ex12 {

    public static void main(String[] args) {
        int a = (int) (Math.random() * 100 + 1);
        int b = (int) (Math.random() * 100 + 1);
        System.out.println(a < b ? "a < b" : "a >= b");
    }

}
