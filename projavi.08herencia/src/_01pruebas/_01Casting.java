package _01pruebas;

import _02ejemplos._04figuras.Figura;

public class _01Casting {
	public static void main(String[] args) {
		//Java no detecta que el casting fallará
		Object o = (Object)"Hola";
		Figura f = (Figura) o;
		
		//Java detecta al compilar que el casting no se podrá hacer
//		Figura f = (Figura) "hola";
	}

}
