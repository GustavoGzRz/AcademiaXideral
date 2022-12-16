package interfaz;

import java.util.*;

public class Principal {
	
	public static void main(String[] args) {
		double x, y;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el valor para la base");
		x = entrada.nextDouble();
		System.out.println("Ingresa el valor para la altura");
		y = entrada.nextDouble();
		entrada.close();
		
		//Polimorfismo
		List<Calcular> calculo = new ArrayList<>();
		calculo.add(new Triangulo(x,y));
		calculo.add(new Cuadrado(x,y));


		for(Calcular calc :calculo) {
			System.out.println(calc);
			double area = calc.area();
			double perimetro = calc.perimetro();
			System.out.println("El área calculada para la figura es: "+area);
			System.out.println("El perimetro calculado para la figura es: "+perimetro);
		}//for-each

	}//main

}//class Principal