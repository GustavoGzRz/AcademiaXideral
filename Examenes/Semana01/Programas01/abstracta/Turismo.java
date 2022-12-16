package abstracta;

public class Turismo extends Vehiculo{
	
	//atributos
	private int puertas;

	//constructor
	public Turismo(String matricula, String marca, String modelo, int puertas) {
		super(matricula, marca, modelo);
		this.puertas = puertas;
	}

	//getter para número de puertas
	public int getPuertas() {
		return puertas;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +" [Puertas: " + puertas +" pertenece a "+ super.toString() + "]";
	}//toString

}// class Turismo