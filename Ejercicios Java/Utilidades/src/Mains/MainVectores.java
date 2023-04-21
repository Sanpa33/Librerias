package Mains;

import Servicios.VectoresServicio;

public class MainVectores {

    public static void main(String[] args) {

        double[] arregloA = new double[50];

        double[] arregloB = new double[20];

        VectoresServicio servicio = new VectoresServicio();

        servicio.inicializarA(arregloA);
        
        System.out.println("El vector A pose:");
        servicio.mostrar(arregloA);

        System.out.println("El vector ordenado de mayor a menor es: ");
        servicio.ordendar(arregloA);

        servicio.inicializarB(arregloA, arregloB);

        System.out.println("El vector A pose:");

        servicio.mostrar(arregloA);

        System.out.println("El arreglo B pose: ");

        servicio.mostrar(arregloB);

    }

}
