package Escuela;

public class Grupo2 extends Grupo{
	public Grupo2(String grad) {
		super(grad);
	}

	@Override
	public void asignar() {
		System.out.println("Grupo 2 "+grad+" Asignado");
	}

}
