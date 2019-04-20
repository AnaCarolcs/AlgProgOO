public class AlgoritmoEuclides
{
	public static int Clides(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return Clides(b, a % b);
	}
}
