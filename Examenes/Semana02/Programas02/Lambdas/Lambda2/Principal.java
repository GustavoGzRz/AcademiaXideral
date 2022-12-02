package Lambda2;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main (String[] args) {
		
		List<Platillo> menu = new ArrayList<>();
		menu.add(new Platillo("Tacos de tripa", 70.00, 545.5f));
		menu.add(new Platillo("Tacos de chorizo", 50.00, 645.5f));
		menu.add(new Platillo("Tacos de pastor", 65.00, 495.0f));
		menu.add(new Platillo("Tacos de suadero", 80.00, 650.7f));
		
		System.out.println("----------=== Tacos ===----------");		
		mostrarPlatillo(menu,plato -> plato.getPrecio()>60);
		
		//En este contrato se trabaja con un String
		Predicado<String> predicadoString  = cadena -> cadena.contains("s");
		System.out.println(predicadoString.consultar("suadero"));
		
		//En este contrato se trabaja con un Double
		Predicado<Double> predicadoDouble  = doble -> doble.equals(60.0);
		System.out.println(predicadoDouble.consultar(5.0));
		
		
		}//main
	
	static void mostrarPlatillo(List<Platillo> lista, Predicado<Platillo> p) {
		for (Platillo e :lista) {
			if(p.consultar(e))//Aquí se ejecuta la lambda
				System.out.println(e);
		}//if
	}//predicado 
	
}//clase Principal


/*Notas:
 * En este ejercicio de lambdas se adapta el uso simple de un <Generic> para no atarse a un
 * un solo parametro
 */