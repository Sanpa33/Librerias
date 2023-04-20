
package Ejercicio4;

import javax.swing.JOptionPane;


//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura.
//La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
//También incluirá un método para calcular la superficie del rectángulo y un método para calcular el perímetro del rectángulo.
//Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
//Se deberán además definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.


public class Rectangulo {
    
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    
    
public void Rellena(){

    base = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base: "));
    altura = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la altura: "));


}   
 
public int Superficie(){

    int sup = base * altura;
    

return sup;
}

public int Perimetro(){

int per = 2 * (base + altura);

return per;
}

public void Muestra(){

    for (int i = 1; i <= altura; i++) {
        
        for (int j = 1; j <= base; j++) {
            
            if ( (i == 1) || (i == altura) || (j == 1) || (j == base)) {
               
                System.out.print("*");
                
            }
            else{
            
                System.out.print(" ");
                
            }
            
           
        }
         System.out.println();
    }



}

    
    
}


