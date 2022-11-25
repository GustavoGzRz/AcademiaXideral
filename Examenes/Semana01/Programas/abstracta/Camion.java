package abstracta;

public class Camion extends Vehiculo{// Extiende de la clase abstracta 'Vehiculo'
	
	//atributo
	private int peso;
	
	//constructor
	public Camion(String matricula, String marca, String modelo, int peso) {
		super(matricula, marca, modelo);
		this.peso = peso;
	}
	
	//getter para peso de camion en toneladas
	public int getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +" [Peso: " + peso +" pertenece a "+ super.toString() + "]";
	}//toString
	
}//class Camion