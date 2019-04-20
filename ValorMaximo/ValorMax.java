import java.util.Random;
public class ValorMax
{
	int[] v;
	int maior;
	
	public ValorMax(int n)
	{
		Random rand = new Random();
		final int TAM = n;
		int max;

		v = new int[TAM];
		System.out.println("Vetor:");
		
		for (int i = 0; i < v.length; ++i)
		{
			v[i] = rand.nextInt(TAM);
			System.out.print(v[i] + " ");
		}
		
		System.out.println();
	}
	
    public int Compare(int []v, int i)
	{
		if (i == v.length - 1)
		{
			return v[i];
		}
		
		else
		{
			int maior = Compare(v, i + 1);
			if (maior > v[i])
				return maior;
			else
				return v[i];
		}
    }
}