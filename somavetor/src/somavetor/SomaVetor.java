package somavetor;

import java.util.Arrays;
import java.util.Random;

public class SomaVetor {

	/**
	 * Retorna a soma de todos os valores do vetor.
	 * 
	 * @param v
	 * @return
	 */
	public static int soma(int[] v) {
		return soma(v, v.length);
	}

	/**
	 * Retorna a soma de todos os valores do vetor v[0..n-1].
	 * 
	 * @param v
	 * @param n
	 * @return
	 */
	private static int soma(int[] v, int n) {
		// Caso base.
		if (n == 1)
			return v[0];

		// Caso geral (recursivo).
		return soma(v, n - 1) + v[n - 1];
	}

	/**
	 * Tamanho do vetor para testes.
	 */
	private static final int TAM = 3;

	/**
	 * Programa para testar método maior.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Gera vetor com números aleatórios.
		Random r = new Random();
		int[] v = new int[TAM];
		for (int i = 0; i < TAM; ++i)
			v[i] = r.nextInt(TAM * 10);

		// Exibe vetor e a soma dos seus valores.
		System.out.printf("Vetor: %s\n", Arrays.toString(v));
		System.out.printf("Maior valor: %d\n", soma(v));
	}

}
