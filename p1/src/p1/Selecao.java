package p1;

public class Selecao {

	void selecao(int n, int	v[]){
			int i, j, min;
			for (i = 1; i < n - 1; i++) {
				min = i;
				for (j = i+1; j < n; j++)
					if (v[j] < v[min])
							min = j;
				int aux = v[i];
				v[i] = v[min];
				v[min] = aux;
			}
	}
	
	void Insertion(int vet[]){
        for(int i=1; i<vet.length; ++i){
            int aux = vet[i];
            int j=i-1;
            for(; j>=0 && vet[j]>aux; --j)
                vet[j+1]=vet[j];
            vet[j+1]=aux;
        }
    }
	
	public static void main(String[] args) {	
		Selecao selecao = new Selecao();
		int vetor[] = {4,3,2,1};
		selecao.selecao(4, vetor);
			
			for (int i = 0; i < 4; i++) {
				System.out.println(vetor[i]);
			}
	}

}
