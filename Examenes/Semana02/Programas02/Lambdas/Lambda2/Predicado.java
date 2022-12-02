package Lambda2;

//@FunctionalInterface
/*Comunica el propósito de la interfaz y  
 * permite al compilador generar un error si la interfaz no cumple las condiciones.*/

@FunctionalInterface
public interface Predicado<T> {

	abstract boolean consultar(T t); //De esta forma no se "casa" con un mismo
									//parametro, sin embargo, si tiene que regresar
									//un boolean (En este ejemplo)
	
	
}
