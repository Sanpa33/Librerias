
package Ejercicio3;

import javax.swing.JOptionPane;


//Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
//A continuación, se deben crear los siguientes métodos:

//Método constructor con todos los atributos pasados por parámetro.

//Método constructor sin los atributos pasados por parámetro.

//Métodos get y set.

//Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.

//Método sumar(): calcular la suma de los números y devolver el resultado al main.

//Método restar(): calcular la resta de los números y devolver el resultado al main

//Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero,
//el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main

//Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero,
//el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y
//se devuelve el resultado al main.




public class Operacion {
    
    //Atributos
    private int num1,num2;
    
    //Metodo Constructor Vacio

    public Operacion() {
    }

    //Metodo Constructor con parametros
    
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void crearOperacion(){
    
       num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
       
    
    }
    
    public int Sumar(){
    
    int suma = num1 + num2;
    
    return suma;
    }
    
    public int Resta(){
    
    int resta = num1 - num2;
    
    return resta;
    }
    
    public int  Multiplicacion(){
        
        int multi;
        
        if (num1 == 0 || num2 == 0) {
            
          return 0;  
            
            
        }
        else{
        
        multi = num1 * num2;
            
        }
    
    
    return multi;
    }
    
    public int Dividir(){
    
    int div;
    
        if (num2==0) {
            
            return 0;
            
        }
        else{
        
        div = num1 / num2;
            
        }
    
        
    return div;
    }
    
}
