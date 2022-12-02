package Lambda3;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

	public static void main (String[] args) {
		
		List<Platillo> menu = new ArrayList<>();
		menu.add(new Platillo("Tacos de tripa", 70.00, 545.5f));
		menu.add(new Platillo("Tacos de chorizo", 50.00, 645.5f));
		menu.add(new Platillo("Tacos de pastor", 65.00, 495.0f));
		menu.add(new Platillo("Tacos de suaperro", 80.00, 650.7f));
		
		System.out.println("----------=== Tacos ===----------");		
		mostrarPlatillo(menu,plato -> plato.getPrecio()>60);
		
		//En este contrato se trabaja con un String
		Predicate<String> predicadoString  = cadena -> cadena.contains("s");
		System.out.println(predicadoString.test("suaperro"));
		
		//En este contrato se trabaja con un String
		Predicate<Double> predicadoDouble  = doble -> doble.equals(60.0);
		System.out.println(predicadoDouble.test(5.0));
		
		
		}//main
	
	static void mostrarPlatillo(List<Platillo> lista, Predicate<Platillo> p) {
		for (Platillo e :lista) {
			if(p.test(e))//Aquí se ejecuta la lambda
				System.out.println(e);
		}//if
	}//predicado 
	
}//clase Principal


/*Notas:
 * En esta versión 3 del ejercicio de lambdas, se complementa con el uso de java.util.function.Predicate 
 * para omitir la creación 'manual' del predicado
 */