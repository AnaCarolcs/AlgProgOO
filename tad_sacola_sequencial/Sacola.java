/**
 * Um tipo abstrato de dados que representa uma sacola de itens. Itens podem ser
 * apenas inseridos e obtidos; mas não podem ser removidos. Os itens são então
 * obtidos por posição (índice iniciando em zero).
 * 
 * @author eraldo
 *
 */
public interface Sacola {
	/**
	 * Adiciona um novo item à sacola.
	 * 
	 * @param item
	 */
	void adiciona(int item);

	/**
	 * Retorna o item na posição fornecida (índice iniciando em zero).
	 * 
	 * @param i
	 * @return
	 */
	int get(int i);

	/**
	 * @return {@code true} se a sacola está vazia e {@code false} caso contrário.
	 */
	boolean vazio();

	/**
	 * @return a quantidade de itens na sacola.
	 */
	int tamanho();
}
