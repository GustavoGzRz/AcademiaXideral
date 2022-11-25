package interfaz;

public class Triangulo implements Calcular{
	double base;
	double altura;

	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double area() {
		return (base*altura)/2;
	}
	
	@Override
	public double perimetro() {
		return (base*3);
	}

	@Override
	public String toString() {
		return "\nTriangulo equilatero[base=" + base + ", altura=" + altura + "]";
	}
	


}
