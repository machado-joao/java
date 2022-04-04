public class Pilha<T> { 
    private T[] elementos;
	private int tamanho;

    @SuppressWarnings("unchecked")
	public Pilha(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Pilha() {
		this(10);
	}

    public void empilhar(T elemento) {
        this.adicionar(elemento);
    }

    public T espiar() {
        // Opção 1 - Gera uma exceção se a pilha estiver vazia
        /* return this.elementos[this.tamanho-1]; */
        
        // Opção 2
        if(this.estaVazia()) {
            return null;
        }
        return this.elementos[this.tamanho-1];
    }

    public T desempilhar() {
        // Opção 1 - Gera uma exceção se a pilha estiver vazia
        /* T elemento = this.elementos[this.tamanho-1];
        this.tamanho--; */

        // Opção 2
        if(this.estaVazia()) {
            return null;
        }
        T elemento = this.elementos[this.tamanho-1];
        return elemento;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
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

    public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.tamanho; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append("]");
		}
		return s.toString();
	}
}
