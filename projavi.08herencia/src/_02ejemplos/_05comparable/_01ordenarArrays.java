package _02ejemplos._05comparable;

import java.util.Arrays;

import _02ejemplos._04figuras.Circulo;
import _02ejemplos._04figuras.Figura;
import _02ejemplos._04figuras.Rectangulo;

public class _01ordenarArrays {
	public static void main(String[] args) {
		// La clase Arrays tiene un método sort capaz de ordenar un array
		// ... de enteros
		int v1[] = { 8, 2, 5, 1, 9, 3 };
		Arrays.sort(v1);
		System.out.println(Arrays.toString(v1));

		// ... de double
		double v2[] = { 8.0, 2.0, 5.0, 1.0, 9.0, 3.0 };
		Arrays.sort(v2);
		System.out.println(Arrays.toString(v2));

		// ... de String
		String v3[] = { "miguel", "ana", "pedro", "benito", "cesar" };
		Arrays.sort(v3);
		System.out.println(Arrays.toString(v3));

		// ... de Vehiculo
		Vehiculo v4[] = { new Vehiculo("3433 UGH", "OPEL", "CORSA"),
				new Vehiculo("8867 KJH", "FORD", "FIESTA"),
				new Vehiculo("1111 BBB", "RENAULT", "CLIO") };
		Arrays.sort(v4);
		System.out.println(Arrays.toString(v4));

		// ... de Figura
		Figura v5[] = { new Circulo(10), new Rectangulo(10, 20),
				new Circulo(15), new Rectangulo(21, 12)

		};
		Arrays.sort(v5);
		System.out.println(Arrays.toString(v5));
	}

}
