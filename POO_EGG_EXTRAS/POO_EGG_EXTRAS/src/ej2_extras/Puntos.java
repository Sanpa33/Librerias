
package ej2_extras;

//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos serán, x1, y1, x2, y2,

import java.util.Scanner;
import javax.swing.JOptionPane;

//siendo cada x e y un punto. Generar un objeto puntos usando un método crearPuntos()
//que le pide al usuario los dos números y los ingresa en los atributos del objeto.
//Después, a través de otro método calcular y devolver la distancia que existe entre
//los dos puntos que existen en la clase Puntos. Para conocer como calcular la distancia entre dos puntos
//consulte el siguiente link:
//http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html



public class Puntos {
    
int x1;
int y1;
int x2;
int y2;



public Puntos() {
    }



public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
public void crearPuntos(){



x1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x1: "));
y1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y1: "));

x2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de x2: "));
y2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de y2: "));





}   

public double Distancia(){

double distancia= Math.sqrt((Math.pow((x2-x1),2))+((Math.pow((y2-y1),2))));



return distancia;
}



}
