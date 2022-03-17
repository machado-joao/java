public class Numero {
    private int numero;

    public Numero() {
        this.numero = 0;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public int inverterNumero() {
        String numeroStr = Integer.toString(getNumero());
        StringBuilder numeroInvertidoStr = new StringBuilder(numeroStr);
        return Integer.parseInt(numeroInvertidoStr.reverse().toString());
    }
}
