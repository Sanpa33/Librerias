
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Libro {
    
    
    //Atributos
    
    int isbn;
    String titulo;
    String autor;
    int numPag;
    
    
    //Metodos Constructores
    //Metodo Constructor (Vacio)

    public Libro() {
        
    }
    
    //Metodo Constructor(Con Parametros)
        
    public Libro(int isbn, String titulo, String autor, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }
  
    public void Rellena(){
    
        isbn = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el isbn"));
        titulo = JOptionPane.showInputDialog("Ingrese el titulo");
        autor = JOptionPane.showInputDialog("Ingrese el nombre del tutor");
        numPag = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de paginas"));
               
    }
 
    public void Imprime(){
    
        System.out.println("El ISBN es "+ isbn);
        System.out.println("El titulo es "+ titulo);
        System.out.println("El tutor es "+ autor);
        System.out.println("El Numero de paginas es "+ numPag);
        
    
    
    }
    
    

}

