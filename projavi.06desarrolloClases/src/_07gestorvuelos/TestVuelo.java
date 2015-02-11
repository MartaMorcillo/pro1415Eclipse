package _07gestorvuelos;

import java.util.Scanner;

import _02ejemplos.TiempoV2;

public class TestVuelo {
	public static void main(String[] args) {
		//Creando los Tiempo al vuelo
		Vuelo v = new Vuelo("IB101","Valencia","Paris",new TiempoV2(19,5),new TiempoV2(21,0));
		
		//Creando los Tiempo previamente
		TiempoV2 t1 = new TiempoV2(19,5);
		TiempoV2 t2 = new TiempoV2(21,0);
		
		Vuelo w = new Vuelo("IB101","Valencia","Paris",t1,t2);
		
		//Reservar ventanilla a Miguel Fernandez
		try {
			int asiento = v.reservarAsiento("Miguel Fernandez", 'V');
			System.out.println("Miguel Fernandez, asiento " + asiento);
			asiento = v.reservarAsiento("Ana Folgado",'V');
			System.out.println("Ana Folgado, asiento " + asiento);
			asiento = v.reservarAsiento("David Mas",'P');
			System.out.println("David Mas, asiento " + asiento);
		} catch (VueloCompletoException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(v.toString());
		
		Scanner tec = new Scanner(System.in);
		System.out.println("Cancelar reserva. Indica asiento a cancelar: ");
		int asiento = tec.nextInt();
		v.cancelarReserva(asiento);
		System.out.println(v.toString());
		
		

	}
}
