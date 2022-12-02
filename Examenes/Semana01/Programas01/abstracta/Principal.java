package abstracta;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		
		//Polimorfismo
		List<Vehiculo> vehiculos = new ArrayList<>();
		//vehiculos.add(new Vehiculo("000XX00", "Audi", "A0"));
		vehiculos.add(new Turismo("000XX1A","VolksWagen","A1", 4));
		vehiculos.add(new Deportivo("000XX2B", "Ferrari", "A2", 350));
		vehiculos.add(new Furgoneta("000XX3C", "Ford", "A3", 1170));
		vehiculos.add(new Camion("000XXWW", "Keenworth", "C3", 21));
		
		for (Vehiculo auto : vehiculos) {
			System.out.println(auto);
		}//for-each
		
	}//main
	
}//class Principal