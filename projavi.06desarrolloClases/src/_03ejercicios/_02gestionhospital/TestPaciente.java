package _03ejercicios._02gestionhospital;

public class TestPaciente {

	public static void main(String[] args) {
		Paciente p1 = new Paciente("Juan",20);
		Paciente p2 = new Paciente("Miguel",30);
		System.out.println("Paciente 1: " + p1);
		System.out.println("Paciente 2: " + p2);
		
		
		System.out.println("Menor: ");
		if(p1.compareTo(p2)<0) System.out.println(p1);
		else System.out.println(p2);
		
		if(p1.getEstado() < p2.getEstado()){
			while(p1.getEstado() < p2.getEstado()) {
				p1.mejorar();
				System.out.println(p1);
				System.out.println(p2);
			}
		} else {
			while(p2.getEstado() < p1.getEstado()) {
				p2.mejorar();
				System.out.println(p1);
				System.out.println(p2);
			}
		}
		
		while(p1.getEstado()<6){
			p1.mejorar();
			p2.mejorar();
			System.out.println(p1);
			System.out.println(p2);
		}
		
	}

}
