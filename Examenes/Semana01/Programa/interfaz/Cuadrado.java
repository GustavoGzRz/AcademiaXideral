package interfaz;

public class Cuadrado implements Calcular{
	double base;
	double altura;

	public Cuadrado(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return (base*altura);
	}
	
	@Override
	public double perimetro() {
		return (base*4);
	}

	@Override
	public String toString() {
		return "\nCuadrado [base=" + base + ", altura=" + altura + "]";
	}
	


}
