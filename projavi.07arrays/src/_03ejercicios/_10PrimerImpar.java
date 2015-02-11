package _03ejercicios;
public class _10PrimerImpar {

    public static void main(String[] args) {
        //Preparamos varios arrays para poder probar el método en distintos casos
        int v1[] = {2,4,6,2,4,12,1,1,1,1,1}; //Pares y luego un impar: 5
        int v2[] = {1,1,1,1,1}; // El primer elem. es impar: 5
        int v3[] = {2,2,2,2,2,2}; // No hay impares: 0
        System.out.println("Primera prueba: " + sumaTrasPrimerImpar(v1));
        System.out.println("Segunda prueba: " + sumaTrasPrimerImpar(v2));
        System.out.println("Tercera prueba: " + sumaTrasPrimerImpar(v3));
        }
    
    /**
     *  Suma de los elementos de v desde la posición en que se
     *  encuentre el primer valor impar
     * @param v Array cuyos elementos se suman
     * @return La suma de los elementos tras el primer valor impar
     */
    public static int sumaTrasPrimerImpar(int v[]){
        boolean enc=false;
        int i=0;
        //Buscamos primer impar
        while(i<v.length && !enc){
            if(v[i]%2 != 0){
                enc = true;
            }
            else i++;
        }

        //Recorremos a partir del primer impar
        int suma = 0;
        for(int j = i+1; j<v.length; j++) suma += v[j];
        
        return suma;
    }

}
