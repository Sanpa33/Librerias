package Servicios;

import java.util.Arrays;
import java.util.Random;

public class VectoresServicio {
    
   

    public void inicializarA(double[] arreglo) {
        
       // Random num = new Random();
        
        for (int i = 0; i < arreglo.length; i++) {
            
            int num = (int)(Math.random()*10+1);
            
            //arreglo[i] = num.nextDouble() * 100; // generamos un número aleatorio entre 0 y 100
            
            arreglo[i]= num;
            
        }
        
    }

    
    public void mostrar(double[] arreglo) {
        
        System.out.println(Arrays.toString(arreglo));
        
        System.out.println(arreglo);
        
    }

    public void ordenar(double[] arreglo) {
        
        Arrays.sort(arreglo);
        for (int i = 0; i < arreglo.length / 2; i++) {
            double temp = arreglo[i];
            arreglo[i] = arreglo[arreglo.length - 1 - i];
            arreglo[arreglo.length - 1 - i] = temp;
            
        }
    }

    public void inicializarB(double[] arregloA, double[] arregloB) {
        
        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }
        for (int i = 10; i < arregloB.length; i++) {
            arregloB[i] = 0.5;
        }
        
    }
}


