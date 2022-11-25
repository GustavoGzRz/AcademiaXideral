package abstracta;

public abstract class Vehiculo { //Se indica que es una clase 'abstracta' por lo que
								//no se podrán instancias / objetos a partir de esta
	
	//atributos
	protected String matricula;
	protected String marca;
	protected String modelo;
	
	//constructor
	public Vehiculo(String matricula, String marca, String modelo) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
	}

	//getters n setters
	public String getMatricula() {
		return matricula;
	}//getMatricula()

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}//setMatricula()

	public String getMarca() {
		return marca;
	}//getMarca()

	public void setMarca(String marca) {
		this.marca = marca;
	}//setMarca()

	public String getModelo() {
		return modelo;
	}//getModelo()

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}//setModelo()

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + "]";
	}//toString
	
}//class Vehiculo