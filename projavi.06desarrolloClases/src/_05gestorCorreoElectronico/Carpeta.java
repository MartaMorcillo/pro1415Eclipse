package _05gestorCorreoElectronico;

public class Carpeta {
	private Mensaje listaMensajes[];
	private int numMensajes;
	private final static int MAXM = 1;
	private String nombre;
	
	public Carpeta (String nombre){
		this.nombre = nombre;
		listaMensajes = new Mensaje[MAXM];
		numMensajes = 0;
	}
	
	public void anyadir(Mensaje m){
		//Si el array esta lleno aumentamos su tamaño al doble
		if(numMensajes == listaMensajes.length){
			//Creamos array del doble de tamaño
			Mensaje aux[] = new Mensaje[listaMensajes.length*2];
			//copiamos mensajes al nuevo array
			for (int i = 0; i < listaMensajes.length; i++) {
				aux[i] = listaMensajes[i];
			}
			//listaMensajes pasa a ser el nuevo array
			listaMensajes = aux;
		}
		
		listaMensajes[numMensajes] = m;
		numMensajes++;
	}
	public void borrar(Mensaje m) throws ElementoNoEncontradoException {
		boolean enc=false;
		int i=0;
		while(i<numMensajes && !enc){
			if(listaMensajes[i].equals(m)) enc = true;
			else i++;
		}
		if(!enc) throw new ElementoNoEncontradoException();
		//Elimino mensaje de la posición i
		for(int j=i;j<numMensajes-1;j++){
			listaMensajes[j] = listaMensajes[j+1];
		}
		numMensajes--;
	}
	public Mensaje buscar(int codigo)throws ElementoNoEncontradoException {
		boolean enc=false;
		int i=0;
		while(i<numMensajes && !enc){
			if(listaMensajes[i].getCodigo()==codigo) enc = true;
			else i++;
		}
		if(!enc) throw new ElementoNoEncontradoException();
		else return listaMensajes[i];
	}
	public Mensaje buscar2(int codigo)throws ElementoNoEncontradoException {
		int i=0;
		while(i<numMensajes){
			if(listaMensajes[i].getCodigo()==codigo) return listaMensajes[i];
			else i++;
		}
		throw new ElementoNoEncontradoException();
	}
	@Override
	public String toString(){
		String res = "Nombre: " + nombre + 
						"\nMensajes:";
		for (int i = 0; i < numMensajes; i++) {
			res += "\n" + listaMensajes[i].toString();
		}
		return res;
	}
	public static void mover(Carpeta origen, Carpeta destino, int codigo) throws ElementoNoEncontradoException {
		Mensaje m = origen.buscar(codigo);
		origen.borrar(m);
		destino.anyadir(m);
	}	
}
