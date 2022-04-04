public class IteradorListaLigada<T> {
    private Elemento<T> elemento;

    public IteradorListaLigada(Elemento<T> elemento) {
        this.elemento = elemento;
    }

    public boolean temProximo() {
        if(this.elemento.getProximo() == null) {
            return false;
        }
        return true;
    }

    public Elemento<T> obterProximo() {
        this.elemento = this.elemento.getProximo();
        return elemento;
    }
}
