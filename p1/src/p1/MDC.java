package p1;

import java.util.Scanner;

	public class MDC{

		public static int n1, n2;

		public static int calculoMDC(int n1, int n2){
			if(n1 == 0)
				return n2 ;
			return calculoMDC(n2%n1,n1);
		}

		public static void main(String[]args){
			Scanner teclado = new Scanner (System.in);

			System.out.println("Digite os numeros:");
			n1 = teclado.nextInt();
			n2 = teclado.nextInt();

			System.out.println("MDC: "+calculoMDC(n1,n2));
		}
	}