package interfaz;

public class Cuadrado extends Figura implements Calcular{

	public Cuadrado(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}// constructor
	
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
	}//toString
	

}//class Cuadrado