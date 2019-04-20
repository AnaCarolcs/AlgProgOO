//Ana Carolina Carvalho
package sacola;

public class DobraSacola<T> implements Sacola<T> {
	private T[] vetor;
	private int n;

	@SuppressWarnings("unchecked")
	public DobraSacola() {
		vetor = (T[]) new Object[10];
		n = 0;
	}

	@Override
	public T get(int i) {
		return vetor[i];
	}

	@Override
	public void insere(T item) {
		vetor[n++] = item;
	}

	@Override
	public int tamanho() {
		if(vetor[n - 1] != null)
			return dobraTam();
	else
		return n;
	}
	 
	public int dobraTam(){
		if(vetor[i] != null)
		return n = n * 2; 
		else 
		return vetor[i];
	}
}