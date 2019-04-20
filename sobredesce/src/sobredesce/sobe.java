//Ana Carolina Carvalho
package sobredesce;

public class sobe {

	public static void sobe (int index) {
		
		// Se index não é a raiz e o valor do index for menor do que o valor de seu pai,
		// troca seus valores (index e pai(index)) e corrige para o pai
		
		if (index > 1 && heap[index] < heap[pai(index)]) {
			swap(heap[index], heap[pai(index)]);
			sobe(pai(index));
			}
		}
}
