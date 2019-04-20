public class FibonacciRec
{
	
	public int Fibo(int n)
	{
		if (n < 2) {
			return n;
		} else {
			return Fibo(n - 1) + Fibo(n - 2);
		}
	}
}