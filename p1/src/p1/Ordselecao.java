package p1;

public class Ordselecao {
	
	public int verifica_ordem(int n, int v[]){
		for (int i = 0; i < n - 1; i++)
			if (v[i] > v[i+1])
				return 0;
			return 1;
			}

	public static void main(String[] args) {	
		Ordselecao ordSelecao = new Ordselecao();
		int n = 4;
		int vetor [] = {1, 2, 7, 4};
        System.out.println(ordSelecao.verifica_ordem(n, vetor));
    }	
	
}
