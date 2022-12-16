package abstracta;

public class Deportivo extends Vehiculo{
	
	//atributos
	private int cilindrada;

	//constructor
	public Deportivo(String matricula, String marca, String modelo, int cilindrada) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
	}

	//getter para mostrar cilindrada
	public int getCilindrada() {
		return cilindrada;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +" [Cilindrada: " + cilindrada +" pertenece a "+ super.toString() + "]";
	}//toString
	
	
}//class Deportivo