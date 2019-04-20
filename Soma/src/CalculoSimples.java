import java.util.Scanner;
public class CalculoSimples {
	
	
	public int soma(int a, int b) {
		return a + b;
	}
	
	public int subtrai(int a, int b) {
		return a - b;
	}
	
	public int divide(int a, int b) {
		return a/b;
	}
	
	public boolean numerosIguais(int a, int b) {
		if(a == b) {
			return true;
		} else return false;
	}
	
	public boolean valorLimite(int a) {
		if (a < 99) {
			return true;
		} else return false;
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
		//System.out.println("Subtração = " + subtrai(num1, num2));
	}
}