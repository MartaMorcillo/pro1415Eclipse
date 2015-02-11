package _03ejercicios;

public class _04Invertir {
    public static void main(String[] args) {
        int a[]={2,4,6,8,10};
        
        int b[] = invertirArray(a);
        System.out.println("Array invertido: ");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
    public static int[] invertirArray(int v[]){
        
        int resultado[] = new int[v.length];
        
        //Invertimos v sobre resultado
        for (int i = 0, j=resultado.length-1; i < v.length; i++,j--) {
            resultado[j] = v[i];
        }
        
        //Lo mismo con bucles while
        int i=0;
        int j = resultado.length-1;
        while(i<v.length){
            resultado[j] = v[i];
            i++;
            j--;
        }
        return resultado;
    }

}
