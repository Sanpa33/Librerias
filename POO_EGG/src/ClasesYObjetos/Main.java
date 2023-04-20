
package ClasesYObjetos;

//Crear una clase llamada Libro que contenga los siguientes atributos:
//ISBN, Título, Autor, Número de páginas, y un constructor con todos
//los atributos pasados por parámetro y un constructor vacío.
//Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título,
//el autor del libro y el número de páginas.


public class Main {

 
    public static void main(String[] args) {
     
        Libro lib1 = new Libro();
        
        lib1.Rellena();
        
        lib1.Imprime();
        
        Libro lib2 = new Libro(3213,"Rayuela","Julio Cortazar",232);
        
        System.out.println(" ");
        lib2.Imprime();
        
        
    }
    
}
