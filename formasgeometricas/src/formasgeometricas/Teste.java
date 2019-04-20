//Ana Carolina Carvalho - 2017.1906.098-3

package formasgeometricas;

public class Teste {
	
	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(2,"azul",true);
		Circulo circulo = new Circulo(2, "vermelho", false);
		Retangulo retangulo = new Retangulo(2,4,"branco", true);

		System.out.println("area do quadrado eh: " + quadrado.area(quadrado.lado));
		System.out.println("area do circulo eh: " + circulo.area(circulo.raio));
		System.out.println("area do Retangulo eh: " + retangulo.area(retangulo.base,retangulo.altura));
	}
}
