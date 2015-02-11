/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package _03ejercicios;

/**
 *
 * @author javi garcia
 */
public class _03Dados {
    final static int LANZAMIENTOS = 10000000;
    final static int FRECUENCIA =1000000;
    
    public static void main(String[] args) {
        int veces[] = new int[7];
        for(int cont = 1; cont <= LANZAMIENTOS; cont++){
            int dado = (int) (Math.random()* 6 + 1);
          
            veces[dado]++;
            if(cont % FRECUENCIA == 0){
                System.out.print("Lanzamientos: " + cont + " --- ");
                //Mostrar estadísticas

                for (int i = 1; i < veces.length; i++) {
                    System.out.format("%d: %7.4f " ,i,100.0 * veces[i]/cont);                  
                }
                System.out.println();
                
            }
        }
    }
}
