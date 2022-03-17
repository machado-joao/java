public class Ex01 {

    public static void main(String[] args) throws Exception {
        Lampada lampada1 = new Lampada("Philips", "Tubular", "LED");
        Lampada lampada2 = new Lampada("Philips", "Espiral", "Fluorescente");

        System.out.println("Lâmpada 1: " + lampada1);
        System.out.println("Lâmpada 2: " + lampada2);
        lampada1.acenderLampada();
        System.out.println("Lâmpada 1: " + lampada1);
    }

}
