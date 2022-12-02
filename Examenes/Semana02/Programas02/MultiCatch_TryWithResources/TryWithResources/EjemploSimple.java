package TryWithResources;

public class EjemploSimple implements AutoCloseable{

	public static void main(String[] args) {
		
		try (EjemploSimple ejemplo = new EjemploSimple()) { 
			System.out.println(ejemplo);
			}
		}


		@Override
		public String toString() {
			return "Ejemplo []";
	}
		
		@Override
		public void close() {
			System.out.println("Cierra ejemplo");
		}

}
