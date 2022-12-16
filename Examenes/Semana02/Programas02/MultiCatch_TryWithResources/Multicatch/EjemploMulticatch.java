package Multicatch;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploMulticatch {
	
    public static void main(String[] args) {
        int x = 10, y, res;
        System.out.print("Voy a dividir 10 entre el numero que ingreses(y)\nIngrese y: ");
        try {
            y = new Scanner(System.in).nextInt();
            res = x / y;
            System.out.println("Resultado: " + res);
        }
        catch (InputMismatchException | ArithmeticException ae) {
            System.out.println("Entrada no valida");
        }
        catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
            ex.printStackTrace(System.out);
        }
        finally {
        	System.out.println("Hola, pasé por el finally");
        }
    }

}