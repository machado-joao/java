public class Ex04 {
    
    public static void main(String[] args) {
        StringBuilder numeros = new StringBuilder();
        for(int i = 48; i <= 57; i++) {
            numeros.append((char) i);
        }
        System.out.println("Números: " + numeros);  
    }

}
