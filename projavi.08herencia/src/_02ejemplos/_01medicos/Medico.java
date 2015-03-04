package _02ejemplos._01medicos;

public class Medico {
	private boolean trabajaEnHospital;

	
	public void tratarPaciente(){
		System.out.println("Como médico que soy, voy a tratar a un paciente");
	}
	
	public boolean isTrabajaEnHospital() {
		return trabajaEnHospital;
	}

	
	public void setTrabajaEnHospital(boolean trabajaEnHospital) {
		this.trabajaEnHospital = trabajaEnHospital;
	}
	
	@Override 
	public String toString() {
		return "Soy un MEDICO";
	}
	

}
