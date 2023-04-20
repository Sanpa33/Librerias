package Ejercicio3;


public class Main3 {

 
    public static void main(String[] args) {
        
        Operacion op = new Operacion(10,2);
        
        System.out.println("La suma es "+op.Sumar());
        System.out.println("La resta es "+op.Resta());
        System.out.println("La mutliplicacion es "+op.Multiplicacion());
        System.out.println("La division es "+op.Dividir());
        
        System.out.println("");
        
        //---------------------------------------------------
        
        
        Operacion op2 = new Operacion();
        
        op2.crearOperacion();
        
        System.out.println("El valor del numero 1 es : "+op2.getNum1());
        System.out.println("El valor del numero 2 es : "+op2.getNum2());
        
        System.out.println("");
        
        System.out.println("Actualizamos los valores de num1= 40 y num2=2 ");
        
        op2.setNum1(40);
        op2.setNum2(2);
        
        System.out.println("La suma es "+op2.Sumar());
        System.out.println("La resta es "+op2.Resta());
        System.out.println("La multiplicacion es "+op2.Multiplicacion());
        System.out.println("La division es "+op2.Dividir());        
        
        
        
        
        
    }
    
}
