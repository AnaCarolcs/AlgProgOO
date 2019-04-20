//Ana Carolina Carvalho - 2017.1906.098-3

package formasgeometricas;

public class Retangulo extends FiguraGeometrica {
	
	protected double base;
	protected double altura;
	
	public Retangulo(double base, double altura, String cor, boolean filled) {
		super.cor = cor;
		super.filled = filled;
		this.base = base;
		this.altura = altura;
	}
	
	public double getbase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double area(double base, double altura) {
		return base*altura;
	}
	
	public double perimetro(double base, double altura) {
		return ((2*base) + (2*altura));
	}
}
