package _02ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _03Finally {
	public static void main(String[] args) {
		try{
			Scanner tec = new Scanner(System.in);
			System.out.println("Introduce entero: ");
			int a = tec.nextInt();
			System.out.println("Introduce entero: ");
			int b = tec.nextInt();
		
			System.out.println(a/b);
		} catch (InputMismatchException e){
			System.out.println("Error en los datos de entrada");
		} finally {
			System.out.println("Se ha ejecutado finally");
		}
		System.out.println("El programa ha continuado despues del try-catch ");
		
	}

}
