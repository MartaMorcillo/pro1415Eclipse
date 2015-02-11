package _03ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class _01Estaturas {
	public static void main(String[] args) {
		Scanner tec = new Scanner (System.in).useLocale(Locale.US);
		double estatura[]= new double[10];
		
		//Leemos los datos
		for(int i=0; i<estatura.length; i++){
			System.out.print("Intruduce estatura: ");
			estatura[i] = tec.nextDouble();
		}
		
		//Mostramos llos datos introducidos
		for (int i = 0; i < estatura.length; i++) {
			System.out.println("Persona " + (i+1) + ": " + estatura [i] + " m.");
		}
	}

}
