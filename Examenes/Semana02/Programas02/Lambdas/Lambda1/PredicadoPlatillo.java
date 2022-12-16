package Lambda1;

//@FunctionalInterface
/*Comunica el propósito de la interfaz y  
 * permite al compilador generar un error si la interfaz no cumple las condiciones.*/

@FunctionalInterface
public interface PredicadoPlatillo {

	abstract boolean consultar(Platillo plato);
	
	
}
