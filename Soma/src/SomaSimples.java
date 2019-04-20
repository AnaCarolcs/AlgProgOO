import java.util.Scanner;

public class SomaSimples {
	public int soma(int a, int b) {
		return a + b;
	}
	
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);
		int num1,
			num2;
		
		System.out.print("A = ");
		num1 = input.nextInt();
		
		System.out.print("B = ");
		num2 = input.nextInt();
		
		//System.out.println("Soma = " + soma(num1, num2));

	}
}
