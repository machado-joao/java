public class ListaLigada<T> {
    private Elemento<T> primeiro;
    private Elemento<T> ultimo;
    private int tamanho;

    public ListaLigada() {
        this.tamanho = 0;
    }

    public void setPrimeiro(Elemento<T> primeiro) {
        this.primeiro = primeiro;
    }

    public Elemento<T> getPrimeiro() {
        return primeiro;
    }

    public void setUltimo(Elemento<T> ultimo) {
        this.ultimo = ultimo;
    }

    public Elemento<T> getUltimo() {
        return ultimo;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void adicionar(T valor) {
        Elemento<T> novoElemento = new Elemento<T>(valor);
        if (this.primeiro == null && this.ultimo == null) {
            this.primeiro = novoElemento;
            this.ultimo = novoElemento;
        } else {
            this.ultimo.setProximo(novoElemento);
            this.ultimo = novoElemento;
        }
        this.tamanho++;
    }

    public void remover(T valor) {
        Elemento<T> anterior = null;
        Elemento<T> atual = this.primeiro;
        for (int i = 0; i < this.getTamanho(); i++) {
            if (atual.getValor().equals(valor)) {
                if (atual == this.primeiro && atual == this.ultimo) { // this.tamanho == 1
                    this.primeiro = null;
                    this.ultimo = null;
                } else if (atual == this.primeiro) {
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == this.ultimo) {
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else {
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }

    public Elemento<T> obter(int posicao) {
        Elemento<T> atual = this.primeiro;
        for (int i = 0; i < posicao; i++) {
            if (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
        }
        return atual;
    }

    public IteradorListaLigada<T> iterador() {
        return new IteradorListaLigada<T>(this.primeiro);
    }
}
