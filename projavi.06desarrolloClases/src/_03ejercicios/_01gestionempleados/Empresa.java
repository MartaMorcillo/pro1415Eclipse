package _03ejercicios._01gestionempleados;

public class Empresa {
	public final static int MAX = 100;
	private String nombre;
	private Empleado plantilla[];
	private int numEmpleados;
	public Empresa(String nombre) {
		this.nombre = nombre;
		plantilla = new Empleado[MAX];
		numEmpleados = 0;
	}
	public void contratar(Empleado e) throws PlantillaCompletaException {
		if(numEmpleados == MAX) throw new PlantillaCompletaException("Plantilla completa");
		plantilla[numEmpleados] = e;
		numEmpleados++;
	}
	@Override
	public String toString(){
		String res= "Nombre: " + this.nombre;
		if(numEmpleados != 0){
			res += "\nEmpleados:";
			for (int i = 0; i < numEmpleados; i++) {
				res += "\n" + plantilla[i].toString();
			}
		}
		return res;
	}
	public  void subirTrienio (double porcentaje){
		for (int i = 0; i < numEmpleados; i++) {
			if(plantilla[i].antiguedad() == 3)
				plantilla[i].incremetarSueldo(porcentaje);
			
		}
	}
	public void despedir(Empleado e) throws ElementoNoEncontradoException{
		boolean enc = false;
		//buscamos el empleado
		int i;
		for(i=0; i<numEmpleados && !enc; i++){
			if(plantilla[i].equals(e)) enc = true;
		}
		
		//eliminamos el empleado
		if(enc){
			for(int j=i-1; j<numEmpleados-1;j++) {
				plantilla[j] = plantilla[j+1];
			}
			numEmpleados--;
		} else throw new ElementoNoEncontradoException("El empleado no existe");
		
		
		
	}

 }
