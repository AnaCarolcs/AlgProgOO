/**
 * Implementa o TAD Sacola para números inteiros usando um vetor de tamanho
 * fixo.
 * 
 * @author eraldo
 *
 */
public class SacolaSequencial implements Sacola {

	/**
	 * Vetor onde os itens são armazenados.
	 */
	private int[] vetor;

	/**
	 * Quantidade de itens na sacola.
	 */
	private int n;

	/**
	 * Cria uma sacola vazia.
	 */
	public SacolaSequencial() {
		// Capacidade padrão da sacola é 10.
		vetor = new int[10];
		n = 0;
	}

	@Override
	public int get(int i) {
		return vetor[i];
	}

	@Override
	public void adiciona(int item) {
		vetor[n++] = item;
	}

	@Override
	public boolean vazio() {
		return n == 0;
	}

	@Override
	public int tamanho() {
		return n;
	}

}
