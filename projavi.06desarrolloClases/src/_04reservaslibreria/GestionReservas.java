package _04reservaslibreria;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionReservas {
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		final String opciones[] = {"Realizar reserva","Cancelar reserva","Pedido","Recepcion","Salir"};
		ListaReservas listaReservas = new ListaReservas();
		int opcion;
		do {
			opcion = menu(opciones,tec);
			switch(opcion){
			case 1: reservar(listaReservas,tec);break;
			case 2: cancelar(listaReservas,tec);break;
			case 3: pedido(listaReservas, tec);break;
			case 4: recepcion(listaReservas, tec);break;
			}
		} while (opcion != 5);
	}
	public static void reservar(ListaReservas lista, Scanner tec){
		System.out.println("Nombre: ");
		String nombre = tec.nextLine();
		System.out.println("Nif: ");
		String nif = tec.nextLine();
		System.out.println("Telefono: ");
		String tel = tec.nextLine();
		System.out.println("Codigo de libro: ");
		int cod = tec.nextInt();
		System.out.println("Nº de ejemplares");
		int ejem = tec.nextInt();
		tec.nextLine();
		
		try {
			lista.reservar(nif, nombre, tel, cod, ejem);
		} catch (ListaLlenaException e) {
			System.out.println(e.getMessage());
		} catch (ElementoDuplicadoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	public static void cancelar(ListaReservas lista, Scanner tec){
		System.out.println("Nif: ");
		String nif = tec.nextLine();
		
		System.out.println("Codigo de libro: ");
		int cod = tec.nextInt(); tec.nextLine();
		
		try {
			lista.cancelar(nif, cod);
		} catch (ElementoNoEncontradoException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void pedido(ListaReservas lista, Scanner tec){
		System.out.println("Codigo de libro: ");
		int cod = tec.nextInt(); tec.nextLine();
		System.out.println(lista.numEjemplaresReservadosLibro(cod));
	}
	public static void recepcion(ListaReservas lista, Scanner tec){
		System.out.println("Codigo de libro: ");
		int cod = tec.nextInt(); tec.nextLine();
		lista.reservasLibro(cod);
	}
	
	public static int menu(String opciones[],Scanner tec){
		int opcion;
		do{
			//Mostramos el menu
			for (int i = 0; i < opciones.length; i++) {
				System.out.println((i+1) + ": " + opciones[i]);
			}
			//leemos opcion del usuario
			System.out.println("Seleccione una opcion: ");
			opcion = tec.nextInt(); 
			tec.nextLine();
			
			if(opcion <1 || opcion > opciones.length) System.out.println("Opcion incorrecta");
		} while(opcion <1 || opcion > opciones.length);
		return opcion;
	}
	
	private static Reserva leerReserva(Scanner tec){
		System.out.println("Nif: ");
		String nif = tec.next();
		System.out.println("Nombre: ");
		String nombre = tec.next();
		System.out.println("Telefono: ");
		String telefono = tec.next();
		System.out.println("Libro: ");
		int libro = tec.nextInt();
		System.out.println("Ejemplares: ");
		int ejemplares = tec.nextInt();
		
		Reserva r = new Reserva(nif,nombre,telefono,libro,ejemplares);
		return r;
	}
}
