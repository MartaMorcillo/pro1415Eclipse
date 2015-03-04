package _02ejemplos._01medicos;

public class _01TestMedicos {
	public static void main(String[] args) {
		System.out.println("-------- Medico --------------");
		//Un médico tiene 
		// - atributo trabajaEnHospital
		// - metodo tratarPaciente
		Medico m1 = new Medico();
		System.out.println(m1.isTrabajaEnHospital());
		m1.tratarPaciente();
		
		//Un MedicoDeCabecera tiene
		//Por ser MedicoDeCabecera
		// - atributo visitaLasCasas
		// - metodo aconsejarPaciente()
		MedicoDeCabecera mc1 = new MedicoDeCabecera();
		System.out.println(mc1.isVisitaLasCasas());
		mc1.aconsejarPaciente();
		
		System.out.println("-------- Medico cabecera --------------");//Por ser Medico
		// - atributo trabajaEnHospital
		// - metodo tratarPaciente
		System.out.println(mc1.isTrabajaEnHospital());
		mc1.tratarPaciente();
		
		System.out.println("-------- Cirujano --------------");
		//Un Cirujano tiene su propio método tratarPaciente
		Cirujano c = new Cirujano();
		c.tratarPaciente();
		
		System.out.println("-------- toString ------------");
		System.out.println(m1.toString());
		System.out.println(mc1.toString());
		System.out.println(c.toString());
		
	
	}
}
