package Servicios;

import java.util.Arrays;

public class VectoresServicio {

    public void inicializarA(double[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            double num = (double) (Math.random() * 10) + 1;  // Devuelve numero entre 0 y 10

            arreglo[i] = num;

        }

    }

    public void mostrar(double[] arreglo) {

        System.out.println(Arrays.toString(arreglo));

    }

    // Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordendar(double[] arreglo) {

        Arrays.sort(arreglo);

        double[] arregloOrdenado = new double[arreglo.length];

        for (int i = 0; i < arreglo.length; i++) {
            arregloOrdenado[i] = arreglo[arreglo.length - 1 - i];
        }

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arregloOrdenado[i]); 
        }

    }
    
    //Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
    //Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    
    public void inicializarB(double [] arregloA, double[] arregloB){
    
//        for (int i = 0; i < 10; i++) {
//        
//            arregloB[i] = arregloA[i];
// 
//        }
//        
//        for (int i = 10; i < arregloB.length ; i++) {
//            
//            arregloB[i] = 0.5;
//            
//        }
        
  for (int i = 0; i < 10; i++) {
        arregloB[i] = arregloA[i];
    }
    
    // Llenar las últimas 10 posiciones del arreglo B con 0.5
    for (int i = 10; i < 20; i++) {
        arregloB[i] = 0.5;
    }
     
    
    }
    
    
    
    
    

}

// Arrays.sort(arreglo);
//  System.out.println(Arrays.toString(arreglo));

