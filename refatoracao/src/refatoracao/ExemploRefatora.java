package refatoracao;

public class ExemploRefatora {

	public static void main(String[] args) {
		int[] valores = {1, 2, 3};
		
		extrairValores(valores, 0);
	}

	/**
	 * @deprecated Use {@link #extrairValores(int[],int)} instead
	 */
	private static void extrairValores(int[] valores) {
		extrairValores(valores, 0);
	}

	private static void extrairValores(int[] valores, int newParam) {
		for (int valor : valores) {
			System.out.println(valor);
		}
	}
	
}
