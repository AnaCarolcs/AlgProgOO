package sequencia;

import java.util.Scanner;
public class Sequencia{

	public static int n, cont=0;

	public static int ciclo(int n){
		int cont1=1;
		while(n!=1){
			if(n%2==0){
				n/=2;
				System.out.println(n);
			}

			else{
				n= n*3 +1;
				System.out.println(n);
			}

			cont1++;
		}
		System.out.println("Comprimento: "+ cont1);
		return n;
		
	}

	public static int cicloR(int n){
		System.out.println(n);
		cont++;
		if(n==1){
			System.out.println("Comprimento: "+cont);
			return n;
		}
			

		else if(n%2==0){
			return cicloR(n/2);

		}
		else
			return cicloR((n*3)+1);
		
			
	}
	public static void main (String[]args){
		Scanner teclado = new Scanner (System.in);

		System.out.println("Digite um numero:");
		n = teclado.nextInt();

		System.out.println("Final iterativo: " +ciclo(n));

		System.out.println("Final recursivo: "+cicloR(n));
	}
}
