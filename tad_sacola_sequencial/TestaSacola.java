import java.util.Random;

/**
 * Programa que testa a SacolaSequencial.
 * 
 * @author eraldo
 *
 */
public class TestaSacola {

	/**
	 * Quantidade de itens a serem inseridos na sacola.
	 */
	private static int TAM = 10;

	public static void main(String[] args) {
		/*
		 * Cria uma sacola vazia. Observe que o tipo da variável é Sacola, e não
		 * SacolaSequencial.
		 */
		Sacola sacola = new SacolaSequencial();

		// Gerado de números aleatórios.
		Random rand = new Random();

		// Insere TAM números aleatórios na sacola e os exibe.
		System.out.print("Itens:");
		for (int i = 0; i < TAM; ++i) {
			int item = rand.nextInt(TAM);
			sacola.adiciona(item);
			System.out.printf(" %d", item);
		}
		System.out.println();

		// Pescore todos os itens da sacola e os exibe.
		System.out.print("Itens:");
		for (int i = 0; i < sacola.tamanho(); ++i)
			System.out.printf(" %d", sacola.get(i));
		System.out.println();
	}

}
