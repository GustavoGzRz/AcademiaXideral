package Lambda1;
import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main (String[] args) {
		
		List<Platillo> menu = new ArrayList<>();
		menu.add(new Platillo("Tacos de tripa", 70.00, 545.5f));
		menu.add(new Platillo("Tacos de chorizo", 50.00, 645.5f));
		menu.add(new Platillo("Tacos de pastor", 65.00, 495.0f));
		menu.add(new Platillo("Tacos de suaperro", 80.00, 650.7f));
		
		System.out.println("----------=== Tacos ===----------");		
		mostrarPlatillo(menu,plato -> plato.getPrecio()>60);
		
		}//main
	
	static void mostrarPlatillo(List<Platillo> lista, PredicadoPlatillo p) {
		for (Platillo e :lista) {
			if(p.consultar(e))
				System.out.println(e);
		}//if
	}//predicado
	
}//clase Principal

/*Notas:
 * En este ejercicio se aplican lambdas a un ejemplo sencillo con el fin
 * de demostrar su modo básico de empleo
 */