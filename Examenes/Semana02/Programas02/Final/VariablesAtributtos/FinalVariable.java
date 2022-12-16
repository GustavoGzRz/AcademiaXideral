package VariablesAtributtos;

public class FinalVariable {

	public static void main (String[] args) {
		final int num = 5;
		final int res = num + 5;
		num = 3;
		
		System.out.println(res);
	}//main
	
}//clase FinalVariable

/*Nota:
 * Errado con intención. Se busca demostrar la utilidad del 'final' en una variable
 * */