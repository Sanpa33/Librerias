
package ej7_extras;

//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método
//"calcular_area" que calcule y devuelva el área del rectángulo.
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo"
//con lados de 4 y 6 y imprime el área del rectángulo.


public class Rectangulo {
    
    
    int lado1;
    int lado2;
    
  public int calcular_area(int lado1, int lado2){
  
      int area= lado1*lado2;
      
      
      return area;
  }  
    
    
}
