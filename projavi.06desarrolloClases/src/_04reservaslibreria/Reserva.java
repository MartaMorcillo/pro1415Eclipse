package _04reservaslibreria;

/**
 *
 * @author javi
 */
public class Reserva {
    private String nif;
    private String nombre;
    private String telefono;
    private int codigo;
    private int ejemplares;


   /**
    * Crea una reserva con los datos indicados
    * @param nif nif del cliente
    * @param nombre nombre del cliente
    * @param tel telefono del cliente
    * @param codigo codigo del libro
    * @param ejemplares num de ejemplares que se reservan
    */
    public Reserva(String nif,String nombre, String tel, int codigo, int ejemplares){
       this.nif = nif;
       this.nombre = nombre;
       this.telefono = tel;
       this.codigo = codigo;
       this.ejemplares = ejemplares;
   }

   /**
    * Crea una reserva con los datos indicados. El num de ejemplares sera 1
    * @param nif nif del cliente
    * @param nombre nombre del cliente
    * @param tel telefono del cliente
    * @param codigo codigo del libro
    */
   public Reserva(String nif,String nombre, String tel, int codigo){
	   //LLamamos al otro constructor:
       this(nif, nombre, tel, codigo, 1);
   }

    public String getNif() {
        return nif;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares){
        this.ejemplares = ejemplares;
    }

    public String toString(){
        return  "Nif: "+ nif +
                "\nNombre: " + nombre +
                "\nTelefono: " + telefono +
                "\nCod. Libro: " +  codigo +
                "\nEjemplares: " + ejemplares ;
    }
    @Override
    public boolean equals (Object o){
    	if(this == o) return true;
    	if(o == null) return false;
    	if (!(o instanceof Reserva)) return false;
    	
        Reserva r = (Reserva) o;
        
        if(nif.equals(r.nif) && codigo == r.codigo) return true;
        else return false;
        // return nif.equals(r.nif) && codigo == r.codigo);
    }
    
    public int compareTo(Object o){
        Reserva r = (Reserva) o;
        if (this.nif.compareTo(r.nif)<0) return -1;
        else if (this.nif.compareTo(r.nif)>0) return 1;
        else if (this.codigo < r.codigo) return -1;
        else if (this.codigo > r.codigo) return 1;
        else return 0;
    	
    }
}
