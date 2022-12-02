package Escuela;

public class Inyector {
	
	static Grupo A = new Grupo1("de primer grado,");
	static Grupo B = new Grupo2("de segundo grado");
	static Grupo C = new Grupo3("de tercecr grado");
	static Grupo D = new Grupo4("Sin grupo");
	
	static void inyectaGrupo(Profesor profe,int grado){
		
		switch(grado) {
		
		case 1: profe.setGrupo(A);
			break;
		case 2: profe.setGrupo(B);
			break;
		case 3: profe.setGrupo(C);
			break;
		default: profe.setGrupo(D);
		}
		
	}

}