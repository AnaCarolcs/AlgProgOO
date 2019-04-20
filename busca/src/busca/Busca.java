package busca;

/**
 * Algoritmos de busca.
 * 
 * @author eraldo
 *
 */
public class Busca {

	/**
	 * Busca sequencial.
	 * 
	 * @param v
	 * @param x
	 * @return
	 */
	public static int buscaSequencial(int[] v, int x) {
		for (int i = 0; i < v.length; ++i)
			if (x == v[i])
				return i;
		return -1;
	}

	/**
	 * Busca sequencial recursiva: chamada externa.
	 * 
	 * @param v
	 * @param x
	 * @return
	 */
	public static int buscaSequencialR(int[] v, int x) {
		return buscaSequencialR(v, v.length, x);
	}

	/**
	 * Busca sequencial recursiva.
	 * 
	 * @param v
	 * @param n
	 * @param x
	 * @return
	 */
	private static int buscaSequencialR(int[] v, int n, int x) {
		if (n == 0)
			return -1;
		if (x == v[n - 1])
			return n - 1;
		return buscaSequencialR(v, n - 1, x);
	}

	/**
	 * Busca binária.
	 * 
	 * @param v
	 * @param x
	 * @return
	 */
	public static int buscaBinaria(int[] v, int x) {
		int esq = -1;
		int dir = v.length;

		while (esq < dir - 1) {
			int meio = (esq + dir) / 2;
			if (v[meio] < x)
				esq = meio;
			else
				dir = meio;
		}

		return dir;
	}

	/**
	 * Busca binária recursiva: chamada externa.
	 * 
	 * @param v
	 * @param x
	 * @return
	 */
	public static int buscaBinariaR(int[] v, int x) {
		return buscaBinariaR(v, -1, v.length, x);
	}

	/**
	 * Busca binária recursiva.
	 * 
	 * @param v
	 * @param esq
	 * @param dir
	 * @param x
	 * @return
	 */
	private static int buscaBinariaR(int[] v, int esq, int dir, int x) {
		if (esq == dir - 1)
			return dir;

		int meio = (esq + dir) / 2;
		if (x > v[meio])
			return buscaBinariaR(v, meio, dir, x);
		else
			return buscaBinariaR(v, esq, meio, x);
	}

}
