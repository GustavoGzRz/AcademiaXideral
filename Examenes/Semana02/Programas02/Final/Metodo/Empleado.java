package Metodo;

public class Empleado extends Persona {
    private int sueldo;

    public Empleado(String nombre, int edad, int sueldo) {
        super(nombre, edad);
        this.sueldo = sueldo;
    }//constructor

    public void imprimirSueldo() {
        System.out.println("El sueldo es:" + sueldo);
    }//imprimirSueldo
    
    public boolean esMayor() {
        if (getEdad() >= 6)
            return true;
        else
            return false;
    }//if
}

/*Nota:
 * Errado con intención. Se busca demostrar la utilidad del 'final' en un metodo
 * */