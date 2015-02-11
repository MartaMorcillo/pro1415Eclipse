package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _02VariasExcepciones {
	public static void main(String[] args) {
		//El usuario introduce su nif
		//A continuación introduce dos posiciones de su nif
		//y se dividen los números de dichas posiciones y
		//se muestra el resultado.
		try{
			Scanner tec = new Scanner(System.in);
			System.out.println("Introduce nif: ");
			String nif = tec.next();
			
			System.out.println("Indica dos posiciones del nif: ");
			int pos1 = tec.nextInt();
			int pos2 = tec.nextInt();
			
			//Número que hay en la primera posición
			int num1 = Integer.parseInt(""+nif.charAt(pos1));
			//Número que hay en la segunda posición
			int num2 = Integer.parseInt(""+nif.charAt(pos2));
			
			//Division de los dos numeros
			System.out.println(num1  + " / " + num2 + " = " +(num1/num2));
		}	catch (InputMismatchException e){
			System.out.println("Error en los datos de entrada");
		} catch (NumberFormatException e) {
			System.out.println("La posición escogida no contiene un número");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("La posición escogida es incorrecta");
		} catch (ArithmeticException e) {
			System.out.println("División por cero");
		} catch (Exception e ){
			System.out.println("Se ha producido algún error inesperado");
		}
		System.out.println("Si has cometido algún error vuelve a ejecutar el programa");
		
		
	}
}
