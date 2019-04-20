public class imprimeAlgumaCoisa
{
	public static void imprimeCoisas(int n)
	{

		if (n != 0)
		{
			imprimeCoisas(n / 2);
			System.out.printf("%c", '0' + n % 2);
		}
	}
}
