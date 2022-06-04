public class Ex01_v2 {

    public static void main(String[] args) {
        for(int simbolo = 32; simbolo <= 126; simbolo++) {
            System.out.print((char) simbolo + " ");
        }
        System.out.println();
        for(char simbolo = ' '; simbolo <= '~'; simbolo++) {
            System.out.print(simbolo + " ");
        }
        System.out.println();
    }

}
