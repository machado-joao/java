import java.lang.reflect.Array;

public class Lista<T> {
	private T[] elementos;
	private int tamanho;

	@SuppressWarnings("unchecked")
	public Lista(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public Lista() {
		this(10);
	}

	@SuppressWarnings("unchecked")
	public Lista(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
	}

	public T obter(int posicao) {
		return this.buscar(posicao);
	}

	public int ultimoIndice(T elemento) {
		for (int i = this.tamanho - 1; i >= 0; i--) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public boolean contem(T elemento) {
		/*
		 * int posicao = buscar(elemento);
		 * if(posicao > -1) {
		 * return true;
		 * }
		 * return false;
		 */
		return buscar(elemento) > -1;
	}

	public void limpar() {
		// Opção 1
		/* this.elementos = (T[]) new Object[this.elementos.length]; */

		// Opção 2
		/* this.tamanho = 0; */

		// Opção 3
		for (int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}

	public boolean adicionar(T elemento) {
		this.aumentarCapacidade();
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}

	public boolean adicionar(int posicao, T elemento) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		this.aumentarCapacidade();
		for (int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}

	@SuppressWarnings("unchecked")
	private void aumentarCapacidade() {
		if (this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

	public T buscar(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.elementos[posicao];
	}

	public int buscar(T elemento) {
		// Busca sequencial
		for (int i = 0; i < this.tamanho; i++) {
			if (this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public void remover(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		for (int i = posicao; i < this.tamanho - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		this.tamanho--;
	}

	public void remover(T elemento) {
		int posicao = this.buscar(elemento);
		if (posicao > -1) {
			this.remover(posicao);
		}
	}

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.tamanho; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if (this.tamanho > 0) {
			s.append("]");
		}
		return s.toString();
	}
}
