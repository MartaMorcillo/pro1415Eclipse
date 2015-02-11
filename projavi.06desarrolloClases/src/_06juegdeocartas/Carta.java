package _06juegdeocartas;

public class Carta {
	public final static int OROS = 0, COPAS = 1, ESPADAS = 2, BASTOS = 3;
	
	private int palo;
	private int valor;
	
	public Carta(){
		this.palo = (int) (Math.random()*4);
		this.valor = (int) (Math.random()*12) +1;
	}

	public Carta (int palo, int valor) throws IllegalArgumentException {
		if (palo < OROS || palo > BASTOS || valor < 1 || valor > 12) 
			throw new IllegalArgumentException();
		
		this.palo = palo;
		this.valor = valor;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int compareTo(Object o){
		Carta c = (Carta) o;
		if (this.palo < c.palo) return -1;
		else if(this.palo > c.palo) return 1;
		else if(this.valor < c.valor) return -1;
		else if(this.valor > c.valor) return 1;
		else return 0;
	}
	@Override
	public boolean equals(Object o){
		if (this == o) return true;
		else if(!(o instanceof Carta)) return false;
		
		return (this.compareTo(o) == 0 );
	}
	public boolean equals2(Object o){
		if (this == o) return true;
		else if(!(o instanceof Carta)) return false;
		
		Carta c = (Carta) o;
		return this.palo == c.palo && this.valor == c.valor;
	}
	
	public Carta sigPalo(){
		int siguiente;
		//siguiente = (this.palo+1)%4
		if(this.palo == BASTOS) siguiente = OROS;
		else siguiente = this.palo + 1;
		
		Carta c = new Carta(siguiente,this.valor);
		return c;
	}
	public Carta sigPalo2(){
		Carta c = new Carta(this.palo,this.valor);
		if(c.palo == BASTOS) c.palo = OROS;
		else c.palo++;
		return c;
	}
	@Override
	public String toString(){
		String nombrePalos[]= {"oros","copas","espadas","bastos"};
		
		return this.valor + " de " + nombrePalos[this.palo];
	}
	public String toString2(){
		String s = this.valor + " de " ;
		switch(this.palo){
		case OROS: s += " oros"; break;
		case COPAS: s += " copas"; break;
		case ESPADAS: s += " espadas"; break;
		case BASTOS: s += " bastos"; break;
		}
		return s;
	}
}
