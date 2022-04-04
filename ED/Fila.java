public class Fila<T> {
    protected T[] elementos;
	protected int tamanho;

    @SuppressWarnings("unchecked")
    public Fila(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

    public Fila() {
        this(10);
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    }

    public void enfileirar(T elemento) {
        aumentarCapacidade();
        this.adicionar(elemento);
    }

    public T espiar() {
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POSICAO = 0;

        if(this.estaVazia()) {
            return null;
        }
        T elementoRemovido = this.elementos[POSICAO];
        this.remover(POSICAO);
        return elementoRemovido;
    }

	public boolean adicionar(T elemento) {
		this.aumentarCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adicionar(int posicao, T elemento) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		this.aumentarCapacidade();
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}

    @SuppressWarnings("unchecked")
	private void aumentarCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

    public void remover(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		for(int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}
}
