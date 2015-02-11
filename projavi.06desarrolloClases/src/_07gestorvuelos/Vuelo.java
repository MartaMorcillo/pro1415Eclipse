package _07gestorvuelos;

import _02ejemplos.TiempoV2;

public class Vuelo {

	private String identificador;
	private String origen, destino;
	private TiempoV2 hSalida, hLlegada;
	private String asientos[];
	private int numP; 
	final static int CAPACIDAD = 50;
	
	public Vuelo (String id, String o, String d, TiempoV2 hS, TiempoV2 hL){
		identificador = id;
		origen = o;
		destino = d;
		hSalida = hS;
		hLlegada = hL;
		
		//numero pasajeros cero
		numP = 0;
		//creamos el array
		asientos = new String[CAPACIDAD+1];
		
	}
	public String getIdentificador(){
		return identificador;
	}
	public String getOrigen(){ 
		return origen;
	}
	public String getDestino(){
		return destino;
	}
	public boolean hayLibres(){
//		if (numP < CAPACIDAD) return true;
//		else return false;
		return numP < CAPACIDAD;
	}
	@Override
	public boolean equals(Object o){
		if(this == o) return true;
		if(!(o instanceof Vuelo)) return false;
		Vuelo v = (Vuelo) o;
		return this.identificador.equals(v.identificador);
	}
	private int asientoLibre(char pref){
		if(pref == 'P')	{
			for(int i = 2; i<asientos.length; i+=2){
				if(asientos[i]==null) return i;
			}
		} else {
			for(int i = 1; i<=CAPACIDAD; i+=2){
				if(asientos[i]==null) return i;
			}
		}
		return 0;
	}
	//De otra forma
	private int asientoLibre2(char pref){
		for(int i = 1; i< asientos.length; i++){
			if(asientos[i]==null && (pref == 'P' && i%2 == 0 || pref == 'V' && i%2 != 0))
				return i;
		}
		return 0;
	}
	
	public int reservarAsiento(String pas, char pref) throws VueloCompletoException {
		//if(hayLibres()==false) throw new VueloCompletoException();
		//if(numP==CAPACIDAD) throw new VueloCompletoException();
		if(!hayLibres()) throw new VueloCompletoException("Vuelo lleno");
		else{
			int a = asientoLibre(pref);
			if (a == 0) {
				//No quedan libres de esa preferencia, consultamos la otra
				if(pref=='V') a = asientoLibre('P');
				else a = asientoLibre('V');
			}
			
			//Realizamos la reserva
			asientos[a] = pas;
			numP++;
			
			return a;
		}
	}
	public void cancelarReserva(int numAsiento){
		if(numAsiento <= CAPACIDAD && asientos[numAsiento]!=null){
			asientos[numAsiento] = null;
			numP--;
		}
	}
	@Override
	public String toString(){
		String s = identificador + " " + origen + " " +	destino + " " + 
					hSalida.toString() + " " + hLlegada.toString() + "\n";
		s += "Pasajeros: \n";
		
		for (int i = 1; i < asientos.length; i++) {
			if (asientos[i] != null) s += "Asiento " + i + ": " + asientos[i] + "\n";
		}
		
		return s;
	}
	
	
	
	
	
	
	
	
	
	
}
