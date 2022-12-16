package abstracta;

public class Furgoneta extends Vehiculo{

	//atributos
	private int carga;

	//constructor
	public Furgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	//getter para carga
	public int getCarga() {
		return carga;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() +" [Carga: " + carga +" pertenece a "+ super.toString() + "]";
	}//toString
	
}//class Furgoneta