public class RecursivoPot
{
	public static double Potencia(double x, int n)
	{
		if (n == 0)
			return 1;
		if (n == 1)
			return x;

		return Potencia(x, 1) * Potencia(x, n - 1);
	}
}
