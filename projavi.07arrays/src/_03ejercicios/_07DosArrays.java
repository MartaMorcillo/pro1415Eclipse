/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package _03ejercicios;

import java.util.Arrays;

/**
 *
 * @author jgarcia
 */
public class _07DosArrays {
    public static double[] sumaArraysIguales(double a[], double b[]){
        double suma[] = new double[a.length];
        for (int i = 0; i < suma.length; i++) {
            suma[i] = a[i] + b[i];
        }
        return suma;
    }

    public static double[] sumaArrays (double a[], double b[]){
    	double suma[] = new double [Math.max(a.length, b.length)];
    	for (int i = 0; i < a.length; i++) {
    		suma[i] += a[i];
		}
    	for (int i = 0; i < b.length; i++) {
    		suma[i] += b[i];
		}
    	return suma;
    }
    public static double[] sumaArrays2(double a[], double b[]){
    	double suma[];
    	if(a.length > b.length){
    		suma = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                suma[i] = a[i]+ b[i];
            }
            for (int i = b.length; i < a.length; i++) {
                suma[i] = a[i];
            }
    	} else {
    		suma = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                suma[i] = a[i]+ b[i];
            }
            for (int i = a.length; i < b.length; i++) {
                suma[i] = b[i];
            }
    	}
    	return suma;
    }

    //de otra forma
    public static double[] sumaArrays3(double a[], double b[]){
        double menor[];
        double mayor[];
        if(a.length < b.length) {
            menor = a;
            mayor = b;
        } else {
            menor = b;
            mayor = a;
        }
        double suma[] = new double[mayor.length];
        for (int i = 0; i < menor.length; i++) {
            suma[i] = menor[i]+mayor[i];
        }
        for (int i = menor.length; i < mayor.length; i++) {
            suma[i] = mayor[i];
        }
        return suma;
    }
    public static void main(String[] args) {
        double a[] = {1,1,1,1};
        double b[] = {2,2,2,2};
        double c[] = {3,3,3,3,3,3,3,3,3};
        System.out.println(Arrays.toString(sumaArraysIguales(a, b)));
        System.out.println(Arrays.toString(sumaArrays(b, c)));
    }

}
