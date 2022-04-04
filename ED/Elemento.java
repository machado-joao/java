public class Elemento<T> {
    private T valor;
    private Elemento<T> proximo;

    public Elemento(T valor) {
        this.valor = valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setProximo(Elemento<T> proximo) {
        this.proximo = proximo;
    }

    public Elemento<T> getProximo() {
        return proximo;
    }
}
