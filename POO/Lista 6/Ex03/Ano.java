public class Ano {
    private int ano;

    public Ano() {
        this.ano = 0;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto(int ano) {
        return (ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0);
    }
}
