package _03ejercicios._03Genericos;

import java.util.Scanner;

public class Genericos2 {
	public static void main(String[] args) {
		System.out.println(minimo("bbbb", "aaaa"));
		System.out.println(minimo(new Integer(2), new Integer(5)));
		System.out.println(minimo(2, 5));
		//Ahora los errores siguientes se detectan en tiempo de compilación
//		System.out.println(minimo(new Integer(2), "hola"));
//		System.out.println(minimo(new Scanner(System.in),
//				new Scanner(System.in)));
	}

	public static <T extends Comparable<T>> T minimo(T o1, T o2) {
		if (o1.compareTo(o2) < 0)
			return o1;
		else
			return o2;
	}

	// apartado b
	public static <T extends Comparable<T>> T maximo(T o1, T o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}

	// apartado c
	public static <T extends Comparable<T>> T minimo(T v[]) {
		T min = v[0];
		for (int i = 1; i < v.length; i++) {
			if (v[i].compareTo(min) < 0)
				min = v[i];
		}
		return min;
	}
}
