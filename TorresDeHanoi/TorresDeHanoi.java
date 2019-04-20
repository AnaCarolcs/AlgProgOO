public class TorresDeHanoi
{
	public static void Hanoi(int n, char hOrigem, char hDestino, char hAuxiliar)
	{
		if (n > 0)
		{
			Hanoi(n - 1, hOrigem, hAuxiliar, hDestino);
			Mover(hOrigem, hDestino);
			Hanoi(n - 1, hAuxiliar, hDestino, hOrigem);
		}
	}

	private static void Mover(char hOrigem, char hDestino)
	{
		System.out.println(hOrigem + " -> " + hDestino);
	}
}
