package _03ejercicios._02gestionhospital;

public class Hospital {
	private Paciente listaCamas[] ;
	private int numLibres;
	private final static int MAXC = 8; 
	
	public Hospital(){
		listaCamas = new Paciente[MAXC+1];
		numLibres = MAXC;
	}
	public int getNumLibres(){
		return numLibres;
	}
	public boolean hayLibres(){
		return numLibres > 0;
	}
	public int primeraLibre(){
		if(!hayLibres()) return 0;
		
		for (int i = 1; i < listaCamas.length; i++) {
			if(listaCamas[i]==null) return i;
		}
		return 0;
	}
	public void ingresarPaciente(String n, int e) throws HospitalLlenoException{
		int numHab = primeraLibre();
		if(numHab == 0 ) throw new HospitalLlenoException("No hay camas libres");
		else{
			listaCamas[numHab] = new Paciente(n,e);
			numLibres--;
		}
		
	}
	private void darAltaPaciente(int i){
		//if(listaCamas[i]!=null){
			listaCamas[i] = null;
			numLibres++;
		//}
	}
	public void darAltas(){
		for (int i = 1; i < listaCamas.length; i++) {
			if(listaCamas[i] != null){
				listaCamas[i].mejorar();
				if(listaCamas[i].getEstado()==6) darAltaPaciente(i);
			}
		}
	}
	@Override
	public String toString(){
		String res = "";
		for (int i = 1; i < listaCamas.length; i++) {
			if(listaCamas[i] != null){
				res += i + " " +listaCamas[i].toString() + "\n";
			} else {
				res += i + " libre\n";
			}
		}
		return res;
	}
}
