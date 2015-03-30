package _03ejercicios._03Genericos;

import java.util.Scanner;

public class Genericos1 {
	public static void main(String[] args) {
		System.out.println(minimo("bbbb", "aaaa"));
		System.out.println(minimo(new Integer(2), new Integer(5)));
		System.out.println(minimo(2, 5));
		//System.out.println(minimo(new Integer(2), "hola"));
		System.out.println(minimo(new Scanner(System.in), new Scanner(System.in)));
	}

	// apartado a
	public static Object minimo(Object o1, Object o2) {
		if (((Comparable) o1).compareTo(o2) < 0)
			return o1;
		else
			return o2;
	}

	// apartado b
	public static Object maximo(Object o1, Object o2) {
		if (((Comparable) o1).compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}

	// apartado c
	public static Object minimo(Object v[]) {
		Object min = v[0];
		for (int i = 1; i < v.length; i++) {
			if (((Comparable) v[i]).compareTo(min) < 0)
				min = v[i];
		}
		return min;
	}
}
