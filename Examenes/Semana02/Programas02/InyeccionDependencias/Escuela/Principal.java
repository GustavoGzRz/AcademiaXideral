package Escuela;

public class Principal {

	public static void main(String[] args) {

		Profesor profe1 = new Profesor("Profesor José");
		Inyector.inyectaGrupo(profe1,1);
		profe1.asignarGrupo();

		Profesor profe2 = new Profesor("Profesora María");
		Inyector.inyectaGrupo(profe2,2);
		profe2.asignarGrupo();
		
		Profesor profe3 = new Profesor("Profesor Luis");
		Inyector.inyectaGrupo(profe3,3);
		profe3.asignarGrupo();
		
		Profesor profe4 = new Profesor("Profesora Laura");
		Inyector.inyectaGrupo(profe4,4);
		profe4.asignarGrupo();
		
	}

}

