package Metodo;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.setEdad(edad);
    }//Persona

    public void imprimirDatosPersonales() {
        System.out.println("Nombre:" + nombre);
        System.out.println("Edad:" + getEdad());
    }//imprimirDatosPersonales

    final public boolean esMayor() {
        if (getEdad() >= 18)
            return true;
        else
            return false;
    }//esMayor

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}//clas Persona

/*Nota:
 * Errado con intención. Se busca demostrar la utilidad del 'final' en un método
 * */