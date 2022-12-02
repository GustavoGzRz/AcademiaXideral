package Escuela;

public class Grupo1 extends Grupo{
	public Grupo1(String grad) {
		super(grad);
	}

	@Override
	public void asignar() {
		System.out.println("Grupo 1 "+grad+" Asignado");
	}

}
