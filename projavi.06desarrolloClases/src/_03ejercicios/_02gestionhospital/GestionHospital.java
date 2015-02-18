package _03ejercicios._02gestionhospital;

public class GestionHospital {

	public static void main(String[] args) {
		Hospital h = new Hospital();
		try{
			h.ingresarPaciente("a", 20);
			h.ingresarPaciente("b", 20);
			h.ingresarPaciente("c", 20);
			h.ingresarPaciente("d", 20);
			h.ingresarPaciente("e", 20);
		} catch(HospitalLlenoException e){
			System.out.println("El hospital se ha llenado");
		}
		System.out.println(h.toString());
		
		//Damos altas mientras no haya 6 hab libres
		while(h.getNumLibres()<6){
			h.darAltas();
			System.out.println("--------------------");
			System.out.println(h.toString());
		}
	}

}
