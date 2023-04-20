package Servicios;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaService {

    Scanner scanner = new Scanner(System.in);

    //Persona p = new Persona();
    // Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. Retornar el objeto Persona creado.
    public Persona crearPersona(Persona persona) {

        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(scanner.nextLine());

        System.out.println("Ingrese la fecha de nacimiento");

        System.out.println("Ingrese el dia:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes");
        int mes = scanner.nextInt() - 1;
        System.out.println("Ingrese el anio");
        int anio = scanner.nextInt() - 1900;

        Date fecha = new Date(anio, mes, dia);
        persona.setFechaNacimiento(fecha);

        return persona;
    }

    // Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
    public int calcularEdad(Date fecha) {

        Date fechaActual = new Date();

        int aniosDiferencia = fechaActual.getYear() -fecha.getYear();

        return aniosDiferencia;
    }

    //Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor que la edad consultada o false en caso contrario.
    public Boolean menorQue(Persona persona, int edad) {

        Date fechaPersona = persona.getFechaNacimiento();

        return fechaPersona.getYear() > edad;

    }

    // Método mostrarPersona que muestra la información de la persona deseada.
    
    public void mostrarPersona(Persona persona) {

        System.out.println("Nombre:"+persona.getNombre());
        
        System.out.println("Fecha de nacimiento:"+ persona.getFechaNacimiento());
        
        System.out.println("Edad: "+ this.calcularEdad(persona.getFechaNacimiento()));
        
      
    }

   
    
}
