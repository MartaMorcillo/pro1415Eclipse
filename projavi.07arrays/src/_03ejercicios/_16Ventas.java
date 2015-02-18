package _03ejercicios;


import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
public class _16Ventas {

    public static void main(String[] args) {
        int ventas[][]= {
                    {10,  20,  140, 68,  72,  21,  55,  84,  12,  90},
                    {11,  20,  123, 168, 92,  11,  65,  91,  17,  50},
                    {1,   23,  140,  68,  72,  21,  55,  4,   120, 60},
                    {126, 120, 146, 168, 172, 121, 155, 184, 112, 190},
                    {42,  20,  98,  68,  72,  21,  55,  84,  12,  30}
        };
    
        double precios[] = {10.2, 20.3, 8.5, 10.0, 1.1, 9.3, 12.0, 21.6, 13.9, 17.7};
        
        distribuidorMasVentas(ventas);
        articuloMasVentas(ventas);
        informeComisiones(ventas,precios);
    }
    public static void distribuidorMasVentas(int v[][]){
        //Recorremos por distribuidor (filas)
        int maximasVentas= 0;
        int distMasVentas = 0;
        for (int i = 0; i < v.length; i++) {
            int totalDistribuidor = 0;
            for (int j = 0; j < v[i].length; j++) {
                totalDistribuidor += v[i][j];
            }
            if(totalDistribuidor > maximasVentas){
                maximasVentas = totalDistribuidor;
                distMasVentas = i;
            }
        }
        System.out.println("El distribuidor con m√°s ventas es el " + (distMasVentas+1));
    }
    public static void articuloMasVentas(int v[][]){
        //Recorremos por articulo (columnas)
        int maximasVentas= 0;
        int artMasVentas = 0;
        for (int j = 0; j < v[0].length; j++) {
            int totalArticulo = 0;
            for (int i = 0; i < v.length; i++) {
                totalArticulo += v[i][j];
            }
            if(totalArticulo > maximasVentas){
                maximasVentas = totalArticulo;
                artMasVentas = j ;
            }
        }
        System.out.println("El articulo con m√°s ventas es el " + (artMasVentas+1));

    }
    public static void informeComisiones(int v[][], double p[]){
        for (int i = 0; i < v.length; i++) {
            int totalDistribuidor = 0;
            for (int j = 0; j < v[i].length; j++) {
                totalDistribuidor += (v[i][j]*p[j]);
            }
            double comision=0;

            if(totalDistribuidor >70000 ) comision = 8;
            else if(totalDistribuidor > 30000) comision = 5;

            if(comision > 0){
                double importeComision =totalDistribuidor*comision/100;
                System.out.println( "Vendedor: " + (i+1) + 
                		". Total: "+ totalDistribuidor + 
                		" Ä. Porcentaje comision: " + comision +
                		" %. Importe comision: " + importeComision + " Ä");
            }
        }
    }
}
