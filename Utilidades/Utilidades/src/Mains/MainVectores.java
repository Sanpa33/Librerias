package Mains;

import Servicios.VectoresServicio;

public class MainVectores {

    public static void main(String[] args) {


        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        VectoresServicio servicio = new VectoresServicio();
        
        servicio.inicializarA(arregloA);
        System.out.println("Arreglo A:");
        servicio.mostrar(arregloA);
        
        servicio.ordenar(arregloA);
        System.out.println("Arreglo A ordenado de mayor a menor:");
        servicio.mostrar(arregloA);
        
        servicio.inicializarB(arregloA, arregloB);
        System.out.println("Arreglo B:");
        servicio.mostrar(arregloB);
    }

        

    }


