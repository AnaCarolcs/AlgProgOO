public class FibonacciInt
{
	public int CalculaFib(int n)
	{
		int fib = 0;
		int ant = 0;
		for (int i = 1; i <= n; i++)
		{
			if (i == 1)
			{
				fib = 1;
				ant = 0;
			}else{
				fib += ant;
                		ant = fib - ant;
			}
		}
		return fib;
	}
}
