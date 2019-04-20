package potenciarecursiva;

public class PotenciaRecursiva {

	public int pot(int x, int y) {
		if (y == 0) {
			return 1;
		} else if (y % 2 == 0) {
			int potencia = pot(x, y/2);
			return potencia * potencia;
		} else {
			return x*pot(x, y-1);
		}
	}

	public static void main(String[] args) {
		PotenciaRecursiva potenciaRecursica = new PotenciaRecursiva();
		System.out.println(potenciaRecursica.pot(2, 7));
	}
	
}
