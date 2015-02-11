package _03ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _01PedirCincoEnteros {
	/*
	 * Pide 5 numeros. Si el usuario se equivoca en alguno el programa termina.
	 */
	static Scanner tec = new Scanner(System.in);
	
	public static void main(String[] args) {
	}
	public static void leer_a() {
		try{
			for(int i=1; i<=5; i++){
				System.out.println("Introduce número " + i + ": ");
				int num = tec.nextInt();
			}
		} catch (InputMismatchException e){
			System.out.println("Te has equivocado");
		}
		System.out.println("Fin");
	}
	public static void leer_b() {
		for(int i=1; i<=5; i++){
			try{
				System.out.println("Introduce número " + i + ": ");
				int num = tec.nextInt();
			} catch (InputMismatchException e){
				tec.nextLine();
				System.out.println("Te has equivocado");
			}
		}
		System.out.println("Fin");
	}
	public static void leer_c() {
		for(int i=1; i<=5; i++){
			try{
				System.out.println("Introduce número " + i + ": ");
				int num = tec.nextInt();
			} catch (InputMismatchException e){
				tec.nextLine();
				System.out.println("Te has equivocado");
				i--;
			}
		}
		System.out.println("Fin");
	}

	public static void leer_d() {
		
		boolean ok = false;
		do{
			try{
				for(int i=1; i<=5; i++){
					System.out.println("Introduce número " + i + ": ");
					int num = tec.nextInt();
				}
				ok = true;
			} catch (InputMismatchException e){
				tec.nextLine();
				System.out.println("Te has equivocado");
			}
		} while (!ok);
		System.out.println("Fin");
	}
}
