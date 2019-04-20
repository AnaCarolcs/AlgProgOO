public class FibonacciRecTeste
{
	public static void main(String[] args)
	{
		double tempoInicio = System.currentTimeMillis();
		
		FibonacciRec calc = new FibonacciRec();
		
		System.out.print(calc.Fibo(64) + "\t");
	
/*		for (int i = 1; i <= 8; i++)
		{
			System.out.print("(" + i + "):" + calc.Fibo(i) + "\t");
		}
*/		
		System.out.println();
		System.out.println("Tempo Total: " + ((System.currentTimeMillis()-tempoInicio)/1000) + "s.");	 
	}
}