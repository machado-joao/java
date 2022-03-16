public class Ex03 {
    
    public static void main(String[] args) {
        System.out.println("Primeira maneira:");
        String alfabeto = "";
        for(int i = 97; i <= 122; i++) {
            alfabeto += (char) i;
        }
        System.out.println("Alfabeto: " + alfabeto);

        System.out.println("Segunda maneira:");
        StringBuilder alfabetoSB = new StringBuilder();
        for(int i = 97; i <= 122; i++) {
            alfabetoSB.append((char) i);
        }
        System.out.println("Alfabeto: " + alfabetoSB);    
    }

}
