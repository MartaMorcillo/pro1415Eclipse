package _03ejercicios._01gestionempleados;

public class TestEmpresa {
	public static void main(String[] args) {
		Empresa e = new Empresa("MatisseDam");
		
		Empleado emp1 = new Empleado("pepe","111111",2000,1000);
		Empleado emp2 = new Empleado("juan","222222",2001,1100);
		
		try{
			e.contratar(emp1);
			e.contratar(emp2);
			e.contratar(new Empleado("ana","3333333",2002,1200));
		} catch (PlantillaCompletaException ex){
			System.out.println(ex.getMessage());
		}
		
		try{
			e.despedir(new Empleado("","111111",0,0));
			System.out.println("Empleado 111111 despedido");
			e.despedir(new Empleado("","111111",0,0));
			System.out.println("Empleado 111111 despedido");
		} catch (ElementoNoEncontradoException ex){
			System.out.println(ex.getMessage());
		}
	}
}
