//Ana Carolina Carvalho - 2017.1906.098-3

package formasgeometricas;

public class Circulo extends FiguraGeometrica {
	
	protected double raio;
	double pi = 3.14;
	
	public Circulo(double raio, String car, boolean filled) {
		super.cor = cor;
		super.filled = filled;
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double area(double raio) {
		return (pi)*raio*raio;
	}
	
	public double perimetro(double raio) {
		return 2*pi*raio;
	}
	
}
