package Lambda2;

public class Platillo {

	private String nombre;
	private double precio;
	private float calorias;
	
	//constructor
	public Platillo(String Taco, double precio, float calorias) {
		super();
		this.nombre = Taco;
		this.precio = precio;
		this.calorias = calorias;
	}

	//getters n setters
	public String getCategoria() {
		return nombre;
	}

	public void setCategoria(String categoria) {
		this.nombre = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public float getCalorias() {
		return calorias;
	}

	public void setCalorias(float calorias) {
		this.calorias = calorias;
	}

	@Override
	public String toString() {
		return "Platillo: " + nombre + ", precio= $" + precio + ", calorias= " + calorias+" Cal";
	}
	
	
	
	
	
	
	
	
}
