package ej6_extras;

//Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
import java.util.Scanner;

//Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
//en función de su edad y salario actual.
//El aumento salarial debe ser del 10% si el empleado tiene más de 30 años
//o del 5% si tiene menos de 30 años.
public class Empleado {

    String nombre;
    int edad;
    double salario;

    public Empleado() {
    }

    public void Informacion() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado");
        this.nombre = sc.nextLine();

        System.out.println("Ingrese la edad del empleado");
        this.edad = sc.nextInt();

        System.out.println("Ingrese la salario del empleado");
        this.salario = sc.nextDouble();

    }

    public void calcular_aumento() {

        if (this.edad > 30) {

            this.salario = this.salario + (this.salario * 0.10);

        }

        if (this.edad < 30) {

            this.salario = this.salario + (this.salario * 0.05);

        }

    }

    public void imprime_aumento() {

        
        System.out.println("El empleado: "+ this.nombre+" de edad "+ this.edad+" anos");
        System.out.println("Le corresponde segun su edad: "+salario +"$");

    }

}
