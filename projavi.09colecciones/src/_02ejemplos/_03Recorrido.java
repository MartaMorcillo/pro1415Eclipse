package _02ejemplos;

import java.util.Iterator;
import java.util.TreeSet;

public class _03Recorrido {
	public static void main(String[] args) {
		TreeSet<Integer> numeros = new TreeSet<>();
		numeros.add(29);
		numeros.add(9);
		numeros.add(2);
		
		
		//Recorrer la coleccion usando un Iterator
		Iterator<Integer> it = numeros.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		//Recorrer con for-each
		for(Integer i: numeros){
			System.out.println(i);
		}
		
		//Se puede utilizar for-each con arrays
		String v[] = {"ana","miguel","alejandro"};
		for(String nombre: v){
			System.out.println(nombre);
		}
	}
}
