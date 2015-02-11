package _03ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _02Lluvias {
    public static void main(String[] args) {
        double lluvia[] = new double[31];
        try {
            leerArray(lluvia, "lluviasEnero.txt");
//            System.out.println(Arrays.toString(lluvia));
            System.out.println("Lluvias totales del mes: " + suma(lluvia));
            System.out.println("Lluvia media del mes: " + media(lluvia));
            System.out.println("Maxima lluvia caida: " + maximo(lluvia));
            System.out.println("Minima lluvia caida: " + minimo(lluvia));
            System.out.println("El dia que mas llovio: " + (posMaximo(lluvia) + 1));
            System.out.println("El dia que menos llovio: " + (posMinimo(lluvia) + 1));
            System.out.println("Número de dias que no llovio: " + contarApariciones(lluvia, 0.0));
            
            double lluviaPrimeraQuincena = sumaParcial(lluvia, 0,14);
            double lluviaSegundaQuincena = sumaParcial(lluvia, 15,30);
            if(lluviaPrimeraQuincena>lluviaSegundaQuincena) System.out.println("Llovio mas la primera quincena");
            else System.out.println("Llovio mas la segunda quincena");
            
            System.out.println("Dias que llovio menos que al dia siguiente: " + menoresQueElSiguiente(lluvia));
            
          
            int primerDiaDeLLuviaX = posPrimero(lluvia, 19);
            if(primerDiaDeLLuviaX == -1) System.out.println("Ningun dia llovio 19 litros");
            else System.out.println("El primer dia que llovio 19 litros fue: " + (primerDiaDeLLuviaX+1));
            
            
            int ultimoDiaDeLLuviaX = posUltimo(lluvia, 8);
            if(ultimoDiaDeLLuviaX == -1) System.out.println("Ningun dia llovio 8 litros");
            else System.out.println("El ultimo dia que llovio 8 litros fue: " + (ultimoDiaDeLLuviaX+1));
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("El fichero no existe");;
        }
    }
    
    public static void leerArray(double v[], String nombreFichero) throws FileNotFoundException {
        Scanner f = new Scanner(new File(nombreFichero)).useLocale(Locale.US);
        for (int i = 0; i < v.length; i++) {
            v[i] = f.nextDouble();
        }
    }
   
    public static double suma(double v[]){
        double s = 0;
        for (int i = 0; i < v.length; i++) {
            s += v[i];
        }
        return s;
    }
    
    public static double media(double v[]){
        return suma(v)/v.length;
    }
    
    
    public static double maximo (double v[]){
        double max = v[0];
        for (int i = 1; i < v.length; i++) {
            if(v[i] > max) max = v[i];
        }
        return max;
    }
    public static double maximo_v2(double v[]){
        double max = Double.MIN_VALUE;
        for (int i = 0; i < v.length; i++) {
            if(v[i] > max) max = v[i];
        }
        return max;
    }

    public static double minimo (double v[]){
        double min = v[0];
        for (int i = 1; i < v.length; i++) {
            if(v[i] < min) min = v[i];
        }
        return min;
    }
    
    public static int posMaximo(double v[]){
        int posMax = 0;
        for (int i = 1; i < v.length; i++) {
            if(v[i] > v[posMax]) {
                posMax = i;
            }
        }
        return posMax;
    }
    public static int posMinimo(double v[]){
        int posMin = 0;
        for (int i = 1; i < v.length; i++) {
            if(v[i] < v[posMin]) {
                posMin = i;
            }
        }
        return posMin;
    }
    public static int contarApariciones(double v[], double x){
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if(v[i] == x) cont++;
            
        }
        return cont;
    }
    
    public static double sumaParcial(double v[], int izq, int der){
      double s = 0;
        for (int i = izq; i <= der; i++) {
            s += v[i];
        }
        return s;   
    }
    
    public static int menoresQueElSiguiente(double v[]){
        int cont = 0;
        for (int i = 0; i < v.length-1; i++) {
            if(v[i]<v[i+1]) cont ++;
        }
        return cont;
    }
    
    public static int posPrimero(double v[], double x){
        boolean enc = false;
        int i = 0;
        while(i<v.length && !enc){
            if(v[i]==x) enc = true;
            else i++;
        }
        if(enc) return i;
        else return -1;
    }
    public static int posPrimero2(double v[], double x){
    	boolean enc = false;
    	int i;
    	for (i = 0; i < v.length && !enc; i++) {
			if(v[i] == x) enc = true;
		}
    	if(enc) return i-1;
    	else return -1;
    	
    }
    public static int posPrimero3(double v[], double x){
         int i = 0;
         while(i<v.length && v[i] != x){
             i++;
         }
         if(i<v.length) return i;
         else return -1;
    	
    }
    
    
    public static int posUltimo(double v[], double x){
        boolean enc = false;
        int i = v.length-1;
        while(i>=0 && !enc){
            if(v[i]==x) enc = true;
            else i--;
        }
        if(enc) return i;
        else return -1;
    }
   
    
    
}
