package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04PropagarExcepcion {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Introduce dos enteros distintos de cero: ");
		try {
			int num1 = tec.nextInt();
			int num2 = tec.nextInt();
			mostrarOperaciones(num1, num2);
		} catch (InputMismatchException e) {
			System.err.println("Debía introducir un numero real");
		} catch (ArithmeticException e) {
			System.err.println("Los números han de ser distintos de cero");
		}
		System.out.println("-- Fin del programa --");
	}
	//Este método propaga una ArithmeticException, que tendría que ser capturada
	//en otro método 
	public static void mostrarOperaciones(int a, int b)throws ArithmeticException{
		System.out.format("%d / %d = %d%n", a, b, a / b);
		System.out.format("%d + %d = %d%n", a, b, a + b);
		System.out.format("%d - %d = %d%n", a, b, a - b);
		System.out.format("%d * %d = %d%n", a, b, a * b);
	}
}