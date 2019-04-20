//Ana Carolina Carvalho
package sobredesce;

public class desce {
	public static void desce(int index=1) {
		// Se index tem filho
		if (filhoE(index) < heap.size()) {
		// Seleciona o filho com menor valor
			int filho = filhoE(index);
		if (filhoD(index) < heap.size() && heap[filhoD(index)] <
			heap[filhoE(index)])
			filho = filhoD(index);
		// Se o valor do pai é menor do que o valor do menor filho, terminamos
		if (heap[index] < heap[filho])
			return;
		// Caso contrário, trocamos o pai com o filho no heap e corrigimos agora para o filho
			swap(heap[index], heap[filho]);
			desce(filho);
		}
	}
}