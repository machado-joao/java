public class Ex04 {
    
    public static void main(String[] args) {
        System.out.println("Primeira maneira:");
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
        System.out.println("*****");

        System.out.println("Segunda maneira:");
        for (int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
