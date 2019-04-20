//Ana Carolina Carvalho - 2017.1906.098-3

package formasgeometricas;

public class Quadrado extends FiguraGeometrica{

	protected double lado;
	
	public Quadrado(double lado, String cor, boolean filled) {
		super.cor = cor;
		super.filled = filled;
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double area(double lado) {
		return lado*lado;
	}
	
	public double perimetro(double lado) {
		return 4 * lado;
	}
	
}
