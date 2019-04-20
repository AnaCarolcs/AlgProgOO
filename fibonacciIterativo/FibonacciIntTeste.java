public class FibonacciIntTeste
{
	public static void main(String[] args)
	{
		double tempoInicio = System.currentTimeMillis();
		FibonacciInt fibo = new FibonacciInt();
		
		for (int i = 1; i <= 8; i++)
		{
			System.out.print("(" + i + "):" + fibo.CalculaFib(i) + "\t");
		}
		
		System.out.println();
		
		System.out.println("Tempo Total: " + ((System.currentTimeMillis()-tempoInicio)/1000) + "s.");
	}
}