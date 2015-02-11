package _02ejemplos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _06CapturarYPropagar {
	public static void main(String[] args) {
		try {
			sumar1();
		} catch (FileNotFoundException e) {
			System.out.println("El fichero no existe (main)");
		}
	}
	public static void sumar1() throws FileNotFoundException{
		//new Scanner produce una excepción comprobada que se captura
		try{
			Scanner fich = new Scanner(new File("ejemplo.txt"));
			int a = fich.nextInt();
			int b = fich.nextInt();
			int c = fich.nextInt();
			System.out.println(a+b+c);
		} catch (FileNotFoundException e){
			System.out.println("El fichero no existe (sumar1)");
			throw e;
		}
		
	}
}
