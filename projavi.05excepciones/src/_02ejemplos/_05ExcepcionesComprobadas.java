package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _05ExcepcionesComprobadas {
	public static void main(String[] args) {
		sumar1();
		try {
			sumar2();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe");
		}
	}
	public static void sumar1() {
		//new Scanner produce una excepción comprobada que se captura
		try{
			Scanner fich = new Scanner(new File("ejemplo.txt"));
			int a = fich.nextInt();
			int b = fich.nextInt();
			int c = fich.nextInt();
			System.out.println(a+b+c);
		} catch (FileNotFoundException e){
			System.out.println("El fichero no existe");
		}
		
	}
	public static void sumar2() throws FileNotFoundException {
		//new Scanner produce una excepción comprobada que se PROPAGA
		Scanner fich = new Scanner(new File("ejemplo.txt"));
		int a = fich.nextInt();
		int b = fich.nextInt();
		int c = fich.nextInt();
		System.out.println(a+b+c);
		
	}
}
