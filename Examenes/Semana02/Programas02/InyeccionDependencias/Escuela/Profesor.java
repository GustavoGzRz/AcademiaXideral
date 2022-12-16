package Escuela;

public class Profesor {
	
	private String nombre;
	private Grupo grupo;

	public Profesor(String nombre) {
		this.nombre = nombre;
	}
	
	void asignarGrupo(){
		System.out.print(nombre +": ");
		grupo.asignar();
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

}
