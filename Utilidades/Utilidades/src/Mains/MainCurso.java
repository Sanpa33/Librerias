
package Mains;

import Entidades.Curso;

public class MainCurso {

  
    public static void main(String[] args) {
        
        Curso c = new Curso();
        
        c.crearCurso();
        System.out.println("La ganancia semanal es" +c.calcularGananciaSemanal());
        
        
    }
    
}
