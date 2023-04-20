package Ejercicio2;

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
import java.util.Scanner;

//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
public class Main_Ej2 {

    public static void main(String[] args) {

        double radio = 5.14;
        
        Circunferencia c1 = new Circunferencia(radio);
        
        System.out.println("El radio es " +c1.getRadio());
        
        
        c1.crearCircunferencia();
       
        
        System.out.println("El radio es "+c1.getRadio());
        
        System.out.println("El area es "+ c1.area());
        
        System.out.println("El area es "+ c1.perimetro());
        
        
        
        
        
        
        
        
    }
    
}
